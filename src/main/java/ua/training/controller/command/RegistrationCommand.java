package ua.training.controller.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.training.model.entity.Role;
import ua.training.model.entity.User;
import ua.training.model.service.UserService;
import ua.training.model.service.UserValidation;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommand implements Command {
    private static final Logger LOGGER = LogManager.getLogger(RegistrationCommand.class);
    private static UserValidation userValidation;
    private static UserService userService;

    public RegistrationCommand() {
//        userService = DefaultUserService.getInstance();
//        userValidation = DefaultUserValidation.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request) {
//Here i should get form attributes from request and check it using utility class. Then I need to check if this user already exist in the DB,
//        and transfer it to DB through layers.
//TODO Maybe it's important to make resource bundle contains attributes names.

//        Todo make method for user validation

        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setRole(Role.valueOf(request.getParameter("role")));
        user.setNameUa(request.getParameter("nameUa"));
        user.setSurnameUa(request.getParameter("surNameUa"));
        user.setNameEng(request.getParameter("nameEng"));
        user.setSurnameEng(request.getParameter("surNameEng"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));

        LOGGER.info("Get user: " + user.getLogin() + " " + user.getRole() + " " + user.getNameUa() + " " + user.getSurnameUa() + " " +
                user.getNameEng() + " " + user.getSurnameEng() + " " + user.getEmail() + " " + user.getPassword());


//        userValidation.validate();

        return "/registration.jsp";
    }
}
