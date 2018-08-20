package ua.training.controller.command;

import ua.training.controller.command.pages.ErrorPage;
import ua.training.controller.command.pages.HomePage;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Invoker {

    private Map<String, Command> commandMap = new HashMap<>();

    public Invoker() {
        commandMap.put("/home", new HomePage());
        commandMap.put("/error", new ErrorPage());
    }

    public String invokeCommand(String command, HttpServletRequest request) {
        if (commandMap.containsKey(command)) {
            return commandMap.get(command).execute(request);
        } else {
            return commandMap.get("/error").execute(request);
        }
    }
}
