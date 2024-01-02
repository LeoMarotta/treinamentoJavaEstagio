/**
 *
 * @author leomarotta
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class UsuarioDAO {
    @Resource(lookup = "jdbc/testeAula")
    private DataSource dataSource;

    private static final String SESSION_KEY = "usuarioLogado";

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean verificarAutenticacao(String nome, String senha, HttpSession session) {
        // Verifica se o usuário já está na sessão
        if (session.getAttribute("usuarioLogado") != null) {
            return true; // Usuário já autenticado na sessão
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE nome = ? AND senha = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                // Usuário autenticado, armazena na sessão
                session.setAttribute("usuarioLogado", nome);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
