package ua.training.model.dao.impl;

import ua.training.model.dao.ConferenceDao;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.LectureDao;
import ua.training.model.dao.UserDao;
import ua.training.model.entity.Conference;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    @Override
    public ConferenceDao createConferenceDao() {
        return new JDBCConferenceFactory(getConnection());
    }

    @Override
    public UserDao createUserDao() {
        return new JDBCUserFactory(getConnection());
    }

    @Override
    public LectureDao createLectureDao() {
        return new JDBCLectureFactory(getConnection());
    }

    private Connection getConnection() {
        try{
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
