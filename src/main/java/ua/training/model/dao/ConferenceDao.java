package ua.training.model.dao;

import ua.training.model.entity.Conference;

import java.util.List;

public interface ConferenceDao extends GenericDao<Conference> {

    List<Conference> getUpcomingConferences();
}
