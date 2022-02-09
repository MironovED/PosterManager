package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {


    @Test
    void addFilm() {
        Film first = new Film(1, "Бладшот");
        Film second = new Film(2, "Вперед");
        Film third = new Film(3, "Отель Белград");
        Film fourth = new Film(4, "Джельтемены");
        Film fifth = new Film(5, "Человек-невидимка");
        Film sixth = new Film(6, "Тролли");
        Film seventh = new Film(7, "Номер один");
        Film eighth = new Film(8, "Назад в будущее");
        Film ninth = new Film(9, "Командос");
        Film ten = new Film(10, "Терминатор");
        Film eleven = new Film(11, "Одноклассники");

        PosterManager manager = new PosterManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, ten, eleven};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    void get5Films() {
        Film first = new Film(1, "Бладшот");
        Film second = new Film(2, "Вперед");
        Film third = new Film(3, "Отель Белград");
        Film fourth = new Film(4, "Джельтемены");
        Film fifth = new Film(5, "Человек-невидимка");
        Film sixth = new Film(6, "Тролли");
        Film seventh = new Film(7, "Номер один");
        Film eighth = new Film(8, "Назад в будущее");
        Film ninth = new Film(9, "Командос");
        Film ten = new Film(10, "Терминатор");
        Film eleven = new Film(11, "Одноклассники");
        Film twelfth = new Film(12, "Выживший");

        PosterManager manager = new PosterManager(5);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);

//        Film[] expected = {twelfth , eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] expected = {twelfth, eleven, ten, ninth, eighth};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void get9Films() {
        Film first = new Film(1, "Бладшот");
        Film second = new Film(2, "Вперед");
        Film third = new Film(3, "Отель Белград");
        Film fourth = new Film(4, "Джельтемены");
        Film fifth = new Film(5, "Человек-невидимка");
        Film sixth = new Film(6, "Тролли");
        Film seventh = new Film(7, "Номер один");
        Film eighth = new Film(8, "Назад в будущее");
        Film ninth = new Film(9, "Командос");
        Film ten = new Film(10, "Терминатор");
        Film eleven = new Film(11, "Одноклассники");
        Film twelfth = new Film(12, "Выживший");

        PosterManager manager = new PosterManager(9);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);


        Film[] expected = {twelfth, eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void get11Films() {
        Film first = new Film(1, "Бладшот");
        Film second = new Film(2, "Вперед");
        Film third = new Film(3, "Отель Белград");
        Film fourth = new Film(4, "Джельтемены");
        Film fifth = new Film(5, "Человек-невидимка");
        Film sixth = new Film(6, "Тролли");
        Film seventh = new Film(7, "Номер один");
        Film eighth = new Film(8, "Назад в будущее");
        Film ninth = new Film(9, "Командос");
        Film ten = new Film(10, "Терминатор");
        Film eleven = new Film(11, "Одноклассники");
        Film twelfth = new Film(12, "Выживший");

        PosterManager manager = new PosterManager(11);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);


        Film[] expected = {twelfth, eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
}