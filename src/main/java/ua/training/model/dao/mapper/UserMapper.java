package ua.training.model.dao.mapper;


import ua.training.model.entity.Role;
import ua.training.model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UserMapper implements ObjectMapper<User>{
    @Override
    public User extractFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();

        user.setId(rs.getInt("user_id"));
        user.setLogin(rs.getString("login"));
        user.setNameUa(rs.getString("user_name_ua"));
        user.setNameEng(rs.getString("user_name_eng"));
        user.setSurnameUa(rs.getString("user_surname_ua"));
        user.setSurnameEng(rs.getString("user_surname_eng"));
        user.setEmail(rs.getString("user_email"));
//        user.setPassHash(Integer.valueOf(rs.getString("password")));  //TODO решить как хранить пароль
        user.setPassword(rs.getString("user_password"));
        user.setRole(Role.valueOf(rs.getString("role2")));
//        user.setRole(rs.getString("role"));

        return user;
    }

    @Override
    public User makeUnique(Map<Integer, User> existing, User entity) {
        existing.putIfAbsent(entity.getId(), entity);

        return existing.get(entity.getId());
    }
}
