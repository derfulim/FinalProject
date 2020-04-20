package ua.training.model.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DBEmulator {

    public static Conference conference;
    public static List<Speaker> speakers;
    public static void init() {

        Lecture lecture = new Lecture();
        lecture.setNameEng("The most useful lecture");
        Lecture lecture1 = new Lecture();
        lecture1.setNameEng("Good lecture");

        Speaker speaker = new Speaker();
                speaker.setNameEng("John");
                speaker.setSurnameEng("Smith");
                speaker.setRating(10);

                Speaker speaker1 = new Speaker();
                speaker1.setNameEng("John");
                speaker1.setSurnameEng("Low");
                speaker1.setRating(20);

        speakers = new ArrayList<>();
        speakers.add(speaker);
        speakers.add(speaker1);

        lecture.setSpeaker(speaker);
        lecture1.setSpeaker(speaker);

        List<User> participants = new ArrayList<>();
        participants.add(speaker);

        List<Lecture> lectures = new ArrayList<>();
        lectures.add(lecture);
        lectures.add(lecture1);

        conference = new Conference();
        conference.setNameEng("Best conference");
        conference.setDate(LocalDateTime.now());
        conference.setPlaceEng("Nearby");
        conference.setLectures(lectures);
        conference.setSits(100);
        conference.setParticipants(participants);
    }
}
