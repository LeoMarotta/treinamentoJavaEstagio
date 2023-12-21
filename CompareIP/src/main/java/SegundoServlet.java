/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leomarotta
 */
@WebServlet(urlPatterns = {"/SegundoServlet"})
public class SegundoServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        try {
            // Obtém o endereço IP do cliente
            String ipCliente = request.getRemoteAddr();

            // Obtém o endereço IP do servidor
            String ipServidor = request.getLocalAddr();

            // Obtém a hora da conexão
            Date dataHoraAtual = new Date();
            SimpleDateFormat formatoHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String horaConexao = formatoHora.format(dataHoraAtual);

            // Obtém o locale do cliente
            Locale localeCliente = request.getLocale();
            String idiomaCliente = localeCliente.getLanguage();

            // Verifica se o cliente está na mesma rede (CASA) ou é estrangeiro (ESTRANGEIRO)
            String statusCliente = (ipCliente.equals(ipServidor)) ? "CASA" : "ESTRANGEIRO";

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TerceiroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HOME</h1>");
            out.println("<p>STRANGER: " + statusCliente + "</p>");
            out.println("<p>IP do Cliente: " + ipCliente + "</p>");
            out.println("<p>IP do Servidor: " + ipServidor + "</p>");
            out.println("<p>Hora da Conexão: " + horaConexao + "</p>");
            out.println("<p>Idioma do Cliente: " + idiomaCliente + "</p>");
            out.println("</body>");
            out.println("</html>");

            // Exibe informações no console do Glassfish
            System.out.println("IP do Cliente: " + ipCliente);
            System.out.println("Hora da Conexão: " + horaConexao);
        } finally {
            out.close();
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
