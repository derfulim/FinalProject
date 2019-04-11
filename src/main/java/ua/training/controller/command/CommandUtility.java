package ua.training.controller.command;


import ua.training.model.entity.Role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashSet;

public class CommandUtility {

    public static void unlogUser(HttpServletRequest request, String login) {
        HashSet<String> loggedUsers = (HashSet<String>)
                request.getSession().getServletContext().getAttribute("loggedUsers");

        loggedUsers.remove(login);
        request.getSession().getServletContext().setAttribute("loggedUsers", loggedUsers);

        HttpSession session = request.getSession();

        session.setAttribute("login", null);
        session.setAttribute("role", null);
    }

    static boolean cannotLogUser(HttpServletRequest request, String login, Role role){


        HashSet<String> loggedUsers = (HashSet<String>) request.getSession().getServletContext()
                .getAttribute("loggedUsers");

        if(loggedUsers.stream().anyMatch(login::equals)){
            return true;
        }

        loggedUsers.add(login);
        request.getSession().getServletContext().setAttribute("loggedUsers", loggedUsers);

        HttpSession session = request.getSession();

        session.setAttribute("login", login);
        session.setAttribute("role", role);

        return false;
    }
}
