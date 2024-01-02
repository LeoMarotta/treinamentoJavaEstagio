import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author leomarotta
 */
@WebServlet(urlPatterns = {"/ManterLogin"})
public class ManterLogin extends HttpServlet {

    @Resource(lookup = "jdbc/testeAula")
    private DataSource dataSource;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(); // Recupera ou cria a sessão
        
        // Verifica se o usuário já está autenticado na sessão
        if (session.getAttribute("usuarioLogado") != null) {
            // Verifica se há uma requisição de logout
            String logout = request.getParameter("logout");
            if ("true".equals(logout)) {
                // Remove o cookie
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals("userId")) {
                            cookie.setMaxAge(600); // Define o tempo de vida do cookie como 0 para removê-lo
                            response.addCookie(cookie);
                            break;
                        }
                    }
                }

                // Logout: Invalida a sessão
                session.invalidate();
                response.sendRedirect("index.jsp");
                return;
            }

            response.sendRedirect("reconhecido.jsp");
            return;
        }

        // Se não estiver autenticado, realiza o processo de login
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.setDataSource(dataSource);

        boolean autenticado = usuarioDAO.verificarAutenticacao(usuario, senha, session);

        if (autenticado) {
            // Cria um cookie com o ID do usuário (ou outro identificador único)
            Cookie userIdCookie = new Cookie("userId", usuario);
            userIdCookie.setMaxAge(600); // Tempo de vida do cookie em segundos (10 minutos)
            response.addCookie(userIdCookie);

            response.sendRedirect("reconhecido.jsp");
        } else {
            request.setAttribute("mensagemErro", "Usuário ou senha inválidos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
