/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leomarotta
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class UsuarioDAO {
    @Resource(lookup = "jdbc/testeAula")
    private DataSource dataSource;
    
    public boolean verificarAutenticacao(String usuario, String senha) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean autenticado = false;

        try {
            conn = dataSource.getConnection();

            String query = "";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            autenticado = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

        return autenticado;
    }
}