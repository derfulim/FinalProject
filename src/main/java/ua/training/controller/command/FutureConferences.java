package ua.training.controller.command;

import javax.servlet.http.HttpServletRequest;

public class FutureConferences implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        return "/futureconferences.jsp";
    }

}
