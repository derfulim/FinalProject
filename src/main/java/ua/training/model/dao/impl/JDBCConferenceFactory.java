package ua.training.model.dao.impl;


import ua.training.model.dao.ConferenceDao;
import ua.training.model.dao.mapper.ConferenceMapper;
import ua.training.model.entity.Conference;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCConferenceFactory implements ConferenceDao {

    private Connection connection;

    public JDBCConferenceFactory(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Conference entity) {

    }

    @Override
    public Conference findById(int id) {
       return null;
    }

    @Override
    public List<Conference> findAll() {
        Map<Integer, Conference> Conferences = new HashMap<>();

        final String query = "select * from сonference";

        try(Statement st = connection.createStatement()){

            ResultSet rs = st.executeQuery(query);

            ConferenceMapper conferenceMapper = new ConferenceMapper();

            while(rs.next()) {
                Conference Conference = conferenceMapper.extractFromResultSet(rs);
                conferenceMapper.makeUnique(Conferences, Conference);
            }

            return new ArrayList<>(Conferences.values());

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public List<Conference> getUpcomingConferences() {

        Map<Integer, Conference> conferences = new HashMap<>();

        final String query = "select * from conference order by time limit 8";

        try(Statement st = connection.createStatement()){

            ResultSet rs = st.executeQuery(query);

            ConferenceMapper ConferenceMapper = new ConferenceMapper();

            while (rs.next()){
                Conference conference = ConferenceMapper.extractFromResultSet(rs);
                ConferenceMapper.makeUnique(conferences, conference);
            }

            return new ArrayList<>(conferences.values());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Conference Conference) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
