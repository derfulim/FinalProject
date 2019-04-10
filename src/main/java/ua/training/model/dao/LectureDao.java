package ua.training.model.dao;

import ua.training.model.entity.Lecture;

public interface LectureDao extends GenericDao<Lecture> {
    boolean approve(long lectureId);
}
