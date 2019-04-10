package ua.training.model.dao;


import ua.training.model.dao.impl.JDBCDaoFactory;

public abstract class DaoFactory {

    private static DaoFactory daoFactory;

    public abstract ConferenceDao createConferenceDao();

    public abstract UserDao createUserDao();

    public abstract LectureDao createLectureDao();


    public static DaoFactory getInstance() {

        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    daoFactory = new JDBCDaoFactory();
                }
            }
        }

        return daoFactory;
    }

}
