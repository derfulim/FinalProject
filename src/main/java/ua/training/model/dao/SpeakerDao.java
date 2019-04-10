package ua.training.model.dao;
import ua.training.model.entity.Speaker;

public interface SpeakerDao extends GenericDao<Speaker> {
    boolean changeRating(int newRating, long speakerid);
}
