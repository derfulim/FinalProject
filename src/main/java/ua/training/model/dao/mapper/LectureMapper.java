package ua.training.model.dao.mapper;



import ua.training.model.entity.Lecture;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class LectureMapper implements ObjectMapper<Lecture> {

    @Override
    public Lecture extractFromResultSet(ResultSet rs) throws SQLException {
        Lecture lecture = new Lecture();

        lecture.setId(rs.getInt("lecture_id"));
        lecture.setNameUa(rs.getString("lecture_name_ua"));
        lecture.setNameEng(rs.getString("lecture_name_eng"));

//        lecture.setStatus(Status.valueOf(rs.getString("status").toUpperCase()));

        return lecture;
    }

    @Override
    public Lecture makeUnique(Map<Integer, Lecture> existing, Lecture entity) {
        existing.putIfAbsent(entity.getId(), entity);

        return existing.get(entity.getId());
    }
}
