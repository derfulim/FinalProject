package ua.training.controller.command;

import javax.servlet.http.HttpServletRequest;

public class PastConferences implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/pastconferences.jsp";
    }
}
