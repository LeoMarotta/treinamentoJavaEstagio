package controle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author leomarotta
 */
@WebFilter(filterName = "Filtro", urlPatterns = {"/*"})
public class Filtro implements Filter {

    private static final boolean debug = true;

    private FilterConfig filterConfig = null;

    public Filtro() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        System.out.printf("Indo para o recurso %s\n", req.getRequestURI());


        chain.doFilter(request, response);

        System.out.printf("Passou pelo recurso%s\n", req.getRequestURI());

    }
}