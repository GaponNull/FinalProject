package ua.training.controller.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class EncodingFilter implements Filter {

    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("encoding filter init");

        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("encoding filter processing");

        changeEncodingIfRequired(servletRequest, servletResponse);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }

    private void changeEncodingIfRequired(ServletRequest request, ServletResponse response) throws UnsupportedEncodingException {
        if (encoding != null && !encoding.equalsIgnoreCase(request.getCharacterEncoding())) {
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
        }
    }
}
