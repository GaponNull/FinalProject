package ua.training.controller.filter;

import javax.servlet.*;
import java.io.IOException;

public class JspSecurityFilter implements Filter {

    private String homePage;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Jsp security filter init");
        homePage = filterConfig.getInitParameter("homePage");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Jsp security filter processing");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher(homePage);
        requestDispatcher.forward(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
