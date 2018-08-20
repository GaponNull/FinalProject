package ua.training.controller.command.pages;

import ua.training.controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class HomePage implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "home.jsp";
    }
}
