package ua.training.model.entity;

import java.util.List;

public class User {
    private int id;
    private String login;
    private int passHash; //to think about this field
    private String role;
    private String nameUa;
    private String nameEng;
    private String surnameUa;
    private String surnameEng;
    private String email;
    private String password;

    List<Conference> conferences;

    public User() {
    }

    public User(int id, String login, int passHash, String role, String nameUa, String nameEng, String surnameUa, String surnameEng, List<Conference> conferences) {
        this.id = id;
        this.login = login;
        this.passHash= passHash;
        this.role = role;
        this.nameUa = nameUa;
        this.nameEng = nameEng;
        this.surnameUa = surnameUa;
        this.surnameEng = surnameEng;
        this.conferences = conferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassHash() {
        return passHash;
    }

    public void setPassHash(int passHash) {
        this.passHash = passHash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getSurnameUa() {
        return surnameUa;
    }

    public void setSurnameUa(String surnameUa) {
        this.surnameUa = surnameUa;
    }

    public String getSurnameEng() {
        return surnameEng;
    }

    public void setSurnameEng(String surnameEng) {
        this.surnameEng = surnameEng;
    }

    public List<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passHash=" + passHash +
                ", role='" + role + '\'' +
                ", nameUa='" + nameUa + '\'' +
                ", nameEng='" + nameEng + '\'' +
                ", surnameUa='" + surnameUa + '\'' +
                ", surnameEng='" + surnameEng + '\'' +
//                ", conferences=" + conferences +
                '}';
    }
}
