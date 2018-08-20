package ua.training.controller.filter;

import ua.training.model.entity.Role;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class AuthorizationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        verifySession(servletRequest);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    private void verifySession(ServletRequest request) {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        if (httpServletRequest.getSession(false) == null) {
            createSession(httpServletRequest);
        }
    }

    private void createSession(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().setAttribute("role", Role.GUEST);
    }
}
