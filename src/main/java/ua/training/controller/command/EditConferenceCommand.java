package ua.training.controller.command;

import javax.servlet.http.HttpServletRequest;

public class EditConferenceCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "moderator/editconference.jsp";
    }
}
