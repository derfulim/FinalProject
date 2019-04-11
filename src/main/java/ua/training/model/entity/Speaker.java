package ua.training.model.entity;

public class Speaker extends User{
    private int rating;
    private Lecture lecture;
    private int bonus;

//    public Speaker(int id, String login, int passHash, String role, String nameUa, String nameEng, String surnameUa, String surnameEng, List<Conference> conferences, int rating, int bonus) {
//        super(id, login, passHash, role, nameUa, nameEng, surnameUa, surnameEng, conferences);
//        this.rating = rating;
////        this.lecture = lecture;
//        this.bonus = bonus;
//    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {//TODO
        return "Speaker{"
                + super.toString()+
                "rating=" + rating +
                ", lecture=" + lecture +
                ", bonus=" + bonus +
                '}';
    }
}
