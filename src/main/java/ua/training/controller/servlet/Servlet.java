package ua.training.controller.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.training.controller.command.*;
import ua.training.model.entity.DBEmulator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger(Login.class);
    private Map<String, Command> commands = new HashMap<>();

    public void init() {
        DBEmulator.init();

        LOGGER.info("Initialization of the servlet");
        commands.put("logout", new LogOut());
        commands.put("login", new Login());
        commands.put("registration", new RegistrationCommand());
        commands.put("redirect_registration", new RedirectRegistrationCommand());
        commands.put("redirect_login", new RedirectLoginCommand());
        commands.put("moderator_main", new RedirectToModeratorMainCommand());
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }


    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String path = request.getRequestURI();
        LOGGER.info("Received path is " + path);
        path = path.replaceAll(".*/confmansys/", "");
        LOGGER.info("Replaced path is " + path);

        Command command = commands.getOrDefault(path,
                (r) -> "/index.jsp");
        String page = command.execute(request);
        if (page.contains("redirect")) {
            LOGGER.info("Page was redirected");
            response.sendRedirect(page.replace("redirect:", "/confmansys/"));
        } else {
            LOGGER.info("Page was forwarded");
            request.getRequestDispatcher(page).forward(request, response);
        }
    }
}