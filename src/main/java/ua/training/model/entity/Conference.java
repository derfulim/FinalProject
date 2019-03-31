package ua.training.model.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Conference {
    private int id;
    private String nameUa;
    private String nameEng;
    private String placeUa;
    private String placeEng;
    private LocalDateTime date;
    private List<User> users;
    private List<Lecture> lectures;

    public Conference(int id, String nameUa, String nameEng, String placeUa, String placeEng, LocalDateTime date, List<User>users, List<Lecture> lectures) {
        this.id = id;
        this.nameUa = nameUa;
        this.nameEng = nameEng;
        this.placeUa = placeUa;
        this.placeEng = placeEng;
        this.date = date;
        this.users = users;
        this.lectures = lectures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUa() {
        return nameUa;
    }

    public void setNameUa(String nameUa) {
        this.nameUa = nameUa;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getPlaceUa() {
        return placeUa;
    }

    public void setPlaceUa(String placeUa) {
        this.placeUa = placeUa;
    }

    public String getPlaceEng() {
        return placeEng;
    }

    public void setPlaceEng(String placeEng) {
        this.placeEng = placeEng;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", nameUa='" + nameUa + '\'' +
                ", nameEng='" + nameEng + '\'' +
                ", placeUa='" + placeUa + '\'' +
                ", placeEng='" + placeEng + '\'' +
                ", date=" + date +
                '}';
    }
}
