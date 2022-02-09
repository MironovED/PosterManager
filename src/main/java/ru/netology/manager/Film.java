package ru.netology.manager;

public class Film {
    public int id;
    public String nameFilm;

    public Film(int id, String nameFilm) {
        this.id = id;
        this.nameFilm = nameFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }
}
