package ua.training.controller.command;

import javax.servlet.http.HttpServletRequest;

public class Moderator implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "WEB-INF/moderator/home.jsp";
    }
}
