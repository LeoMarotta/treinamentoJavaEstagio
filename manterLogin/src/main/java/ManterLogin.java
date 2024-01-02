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

        // Verifica se o cookie já existe
        Cookie[] cookies = request.getCookies();
        boolean userIdCookieExists = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userId")) {
                    // Cookie encontrado, usuário já logado
                    userIdCookieExists = true;
                    response.sendRedirect("reconhecido.jsp");
                    break;
                }
            }
        }
        if(!userIdCookieExists) {
            // Cookie não encontrado, realiza o processo de login
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.setDataSource(dataSource); 

            HttpSession session = request.getSession();// Cria sessão

            boolean autenticado = usuarioDAO.verificarAutenticacao(usuario, senha, session);

            if (autenticado) {
                // Cria um cookie com o id do usuário
                Cookie userIdCookie = new Cookie("userId", usuario); // Use o nome do usuário como valor do cookie
                userIdCookie.setMaxAge(600); // Tempo de vida do cookie em segundos (10 minutos)
                response.addCookie(userIdCookie);

                response.sendRedirect("reconhecido.jsp");
            } else {
                request.setAttribute("mensagemErro", "Usuário ou senha inválidos");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            }
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
