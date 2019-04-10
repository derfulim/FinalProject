package ua.training.model.service;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.UserDao;
import ua.training.model.entity.User;

import java.util.Optional;

public class UserService {
    DaoFactory daoFactory = DaoFactory.getInstance();

    public Optional<User> login(String login) {
        Optional<User> result;

        try (UserDao userDao = daoFactory.createUserDao()) {
            result = userDao.findByLogin(login);
        }

        return result;
    }







    public boolean validateData(User user){

        return false;
    }
}
