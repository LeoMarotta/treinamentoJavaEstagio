/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leomarotta
 */

@WebServlet(urlPatterns = {"/RedirecionaPesquisa"})
public class RedirecionaPesquisa extends HttpServlet {

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
        
            String ultimaEscolha = getUltimaEscolha(request);
            request.setAttribute("ultimaEscolha", ultimaEscolha);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            
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
    
    private String getUltimaEscolha(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("ultimaEscolha")) {
                    return cookie.getValue();
                }
            }
        }

        return "";
    }
    
private String construirURLPesquisa(String buscador, String consulta, HttpServletRequest request) throws UnsupportedEncodingException {
    String contexto = request.getContextPath();

    switch (buscador.toLowerCase()) {
        case "google":
            return "https://www.google.com/search?q=" + URLEncoder.encode(consulta, StandardCharsets.UTF_8.toString());
        case "yahoo":
            return "https://search.yahoo.com/search?p=" + URLEncoder.encode(consulta, StandardCharsets.UTF_8.toString());
        case "bing":
            return "https://www.bing.com/search?q=" + URLEncoder.encode(consulta, StandardCharsets.UTF_8.toString());
        case "duckduckgo":
            return "https://www.duckduckgo.com/" + URLEncoder.encode(consulta, StandardCharsets.UTF_8.toString());
        default:
            return contexto + "/PesquisaServlet";
    }
}

    
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
        String buscadorEscolhido = request.getParameter("buscador");
        String consulta = request.getParameter("consulta");

        Cookie cookie = new Cookie("ultimaEscolha", buscadorEscolhido);
        response.addCookie(cookie);

        String urlPesquisa = construirURLPesquisa(buscadorEscolhido, consulta, request);
        response.sendRedirect(urlPesquisa);
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
