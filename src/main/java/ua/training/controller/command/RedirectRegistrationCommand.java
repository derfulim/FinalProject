package ua.training.controller.command;

import ua.training.model.util.PathManager;

import javax.servlet.http.HttpServletRequest;

public class RedirectRegistrationCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return PathManager.getProperty("path.page.registration");
    }
}
