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
import javax.servlet.http.HttpServletResponse;

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

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // Verifica se a requisição está tentando acessar uma imagem
        String requestURI = req.getRequestURI();
        if (requestURI.endsWith(".jpg") || requestURI.endsWith(".jpeg")) {
            // Redireciona para a página de acesso negado para URLs de imagens
            res.sendRedirect(req.getContextPath() + "/acesso-negado.jsp");
            return;
        }

        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
                System.out.println("Filtro:Initializing filter");
            }
        }
    }
}