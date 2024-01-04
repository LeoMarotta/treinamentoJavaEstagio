import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.resource.cci.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author leomarotta
 */
@WebServlet(urlPatterns = {"/ajaxserver"})
public class ajaxserver extends HttpServlet {
    
    @Resource(lookup = "jdbc/testeAula")
    private DataSource dataSource;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String nomeFuncionario = request.getParameter("nome");

            List<String> resultados = consultarBanco(nomeFuncionario);
            
            // Monta a resposta como uma lista de opções para um elemento <select>
            StringBuilder resposta = new StringBuilder("<ul>");
            for (String nome : resultados) {
                resposta.append("<li>").append(nome).append("</li>");
            }
            resposta.append("</ul>");

            // Configura a resposta com o conteúdo gerado
            response.setContentType("text/html");
            response.getWriter().write(resposta.toString());

        } catch (SQLException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } finally {
            out.close();
        }
    }

    private List<String> consultarBanco(String nomeFuncionario) throws SQLException {
        List<String> resultados = new ArrayList<>();

        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT nome FROM funcionario WHERE nome LIKE ?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "%" + nomeFuncionario + "%");
                
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        resultados.add(resultSet.getString("nome"));
                    }
                }
            }
        }

        return resultados;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
