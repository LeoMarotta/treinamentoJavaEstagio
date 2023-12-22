/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leomarotta
 */
@WebServlet(urlPatterns = {"/PrimeiroServlet"})
public class PrimeiroServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(PrimeiroServlet.class.getName());
    
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' type='text/css' href='styles.css'>");
            out.println("<title>Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora</h1>");

            out.println("<form action=\"PrimeiroServlet\" method=\"post\">");
            out.println("  <label for=\"valor1\">Valor 1:</label>");
            out.println("  <input type=\"text\" name=\"valor1\"><br>");
            out.println("  <label for=\"valor2\">Valor 2:</label>");
            out.println("  <input type=\"text\" name=\"valor2\"><br>");

            out.println("  <label for=\"operacao\">Operação:</label>");
            out.println("  <select name=\"operacao\">");
            out.println("    <option value=\"+\">+</option>");
            out.println("    <option value=\"-\">-</option>");
            out.println("    <option value=\"*\">*</option>");
            out.println("    <option value=\"/\">/</option>");
            out.println("  </select><br>");

            out.println("  <input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");

            if ("POST".equals(request.getMethod())) {
                String valor1Str = request.getParameter("valor1");
                String valor2Str = request.getParameter("valor2");
                String operacao = request.getParameter("operacao");

                try {
                    double valor1 = Double.parseDouble(valor1Str);
                    double valor2 = Double.parseDouble(valor2Str);

                    double resultado = 0.0;

                if ("+".equals(operacao)) {
                    resultado = valor1 + valor2;
                } else if ("-".equals(operacao)) {
                    resultado = valor1 - valor2;
                } else if ("*".equals(operacao)) {
                    resultado = valor1 * valor2;
                } else if ("/".equals(operacao)) {
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        out.println("<p style=\"color: red;\">Erro: Divisão por zero.</p>");
                    }
                } else {
                    out.println("<p style=\"color: red;\">Erro: Operação inválida.</p>");
                }

                    out.println("<p>Resultado: " + resultado + "</p>");
                } catch (NumberFormatException e) {
                    out.println("<p style=\"color: red;\">Erro: Insira valores numéricos válidos.</p>");
                }
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

        System.out.println("Requisição invocada no método service");
        LOGGER.log(Level.INFO, "Requisição invocada no método service");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' type='text/css' href='styles.css'>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora</h1>");

            out.println("<form action=\"PrimeiroServlet\" method=\"get\">");
            out.println("  <label for=\"elem1\">Valor 1:</label>");
            out.println("  <input type=\"text\" name=\"elem1\"><br>");
            out.println("  <label for=\"elem2\">Valor 2:</label>");
            out.println("  <input type=\"text\" name=\"elem2\"><br>");
            out.println("  <label for=\"oper\">Operação:</label>");
            out.println("  <select name=\"oper\">");
            out.println("    <option value=\"soma\">Soma</option>");
            out.println("    <option value=\"subtracao\">Subtração</option>");
            out.println("  </select><br>");
            out.println("  <input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");

            String operacao = request.getParameter("oper");
            String valor1Str = request.getParameter("elem1");
            String valor2Str = request.getParameter("elem2");

            try {
                double valor1 = Double.parseDouble(valor1Str);
                double valor2 = Double.parseDouble(valor2Str);

                double resultado = 0.0;

                if ("soma".equals(operacao)) {
                    resultado = valor1 + valor2;
                } else if ("subtracao".equals(operacao)) {
                    resultado = valor1 - valor2;
                } else {
                    out.println("<p style=\"color: red;\">Erro: Operação inválida.</p>");
                }

                out.println("<p>Resultado: " + resultado + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p style=\"color: red;\">Erro: Insira valores numéricos válidos.</p>");
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
        LOGGER.log(Level.INFO, "Invocou um servlet no método init");
        System.out.println("Invocou um servlet no método init");
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
