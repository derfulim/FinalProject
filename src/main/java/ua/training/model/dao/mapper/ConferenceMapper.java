package ua.training.model.dao.mapper;


import ua.training.model.entity.Conference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ConferenceMapper implements ObjectMapper<Conference> {

    @Override
    public Conference extractFromResultSet(ResultSet rs) throws SQLException {
        Conference conference = new Conference();

        conference.setId(rs.getInt("id"));
        conference.setNameUa(rs.getString("conf_name_ua"));
        conference.setNameEng(rs.getString("conf_name_eng"));
        conference.setPlaceUa(rs.getString("place_ua"));
        conference.setPlaceEng(rs.getString("place_eng"));
        conference.setDate(rs.getTimestamp("date_time").toLocalDateTime());

//        LocalDateTime localDateTime = rs.getTimestamp("date{").toLocalDateTime();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
//        conference.setDateTime(localDateTime.format(formatter));

        return conference;
    }

    @Override
    public Conference makeUnique(Map<Integer, Conference> existing, Conference entity) {
        existing.putIfAbsent(entity.getId(), entity);

        return existing.get(entity.getId());
    }
}
