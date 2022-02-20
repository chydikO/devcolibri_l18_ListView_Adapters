package com.chudnovskiy.devcolibri_l18_listview_adapters.pogo;

import java.util.Random;

public class PersonModel {
    private final int id;
    private final String name;
    private final String patronymic;
    private final String surname;

    public PersonModel(String name, String patronymic, String surname) {
        this.id = getRandomNumber( 1, 100);
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    private int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
