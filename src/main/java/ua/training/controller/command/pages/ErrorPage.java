package ua.training.controller.command.pages;

import ua.training.controller.command.Command;
import javax.servlet.http.HttpServletRequest;


public class ErrorPage implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "error.jsp";
    }
}