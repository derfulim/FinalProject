package ua.training.controller.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Login implements Command {

    private static final Logger LOGGER = LogManager.getLogger(Login.class);

    private Map<String, String> pages = new HashMap<>();
//    private UserService userService;

    public Login() {
//        this.userService = userService;

        pages.put("login", "/login.jsp");
        pages.put("MODERATOR", "redirect:moderator");
        pages.put("SPEAKER", "redirect:speaker");
        pages.put("VISITOR", "redirect:visitor");
    }


//    @Override
//    public String execute(HttpServletRequest request) {
//        //TODO use Optional
//        String login = request.getParameter("login");
//        String pass = request.getParameter("pass");
//
//        if( login == null || login.equals("") || pass == null || pass.equals("")  ){
//                    return "/login.jsp";
//        }
//
//        return "/login.jsp";
//    }

    public String execute(HttpServletRequest request) {
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        LOGGER.info("get from form user login and pass: "+login + " " + pass);

        if (login == null || login.equals("") || pass == null || pass.equals("")) {
            LOGGER.info("login of pass is null or empty String");
            return "/login.jsp";
        }
//        Optional<User> user = userService.login(login);
//
//
//        LOGGER.info("get user from db: "+ user.get());
//
//        if (user.isPresent() && pass.equals(user.get().getPassword())) {
//            LOGGER.info("user is present and pass is valid");
//
////            if(CommandUtility.cannotLogUser(request, user.get().getLogin(), user.get().getRole())){
////            if(CommandUtility.cannotLogUser(request, user.get().getLogin(), Role.MODERATOR)){
////                return "/WEB-INF/error.jsp";
////            }
//
////            return pages.getOrDefault(user.get().getRole(), pages.get("login"));
//            return pages.getOrDefault(Role.MODERATOR.name(), pages.get("login"));
//        }

        LOGGER.info("user isn't present or pass isn't valid");

        return "/login.jsp";
    }
}
