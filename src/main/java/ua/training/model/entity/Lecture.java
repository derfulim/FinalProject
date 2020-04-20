package ua.training.model.entity;

public class Lecture {
    private int id;
    private String nameUa;
    private String nameEng;
    private Conference conference;
    private Speaker speaker;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
//    public Lecture(int id, String nameUa, String nameEng, Conference conference) {
//        this.id = id;
//        this.nameUa = nameUa;
//        this.nameEng = nameEng;
//        this.conference = conference;
//    }

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

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", nameUa='" + nameUa + '\'' +
                ", nameEng='" + nameEng + '\'' +
//                ", conference=" + conference +
                '}';
    }
}
