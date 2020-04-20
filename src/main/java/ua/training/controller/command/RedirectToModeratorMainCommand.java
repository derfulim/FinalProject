package ua.training.controller.command;

import ua.training.model.entity.Conference;
import ua.training.model.entity.DBEmulator;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class RedirectToModeratorMainCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
//        return "redirect:moderator/main.jsp";
//        return "moderator/main.jsp";
        List<Conference> events = new ArrayList<>();
        DBEmulator.init();
        events.add(DBEmulator.conference);
        request.setAttribute("speakers", DBEmulator.speakers);
        request.setAttribute("events", events);
        return "/WEB-INF/moderator/main.jsp";

//        return "registration.jsp";
    }
}
