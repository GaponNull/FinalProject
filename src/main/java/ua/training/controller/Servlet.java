package ua.training.controller;

import ua.training.controller.command.Invoker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    private Invoker invoker = new Invoker();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet");
        request.getRequestDispatcher(invoker.invokeCommand(request.getRequestURI(), request)).forward(request, response);
    }
}
