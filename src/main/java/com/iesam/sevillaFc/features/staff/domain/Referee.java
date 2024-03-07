package com.iesam.sevillaFc.features.staff.domain;

public class Referee extends Person {
    public final String category;

    public Referee(String id, String name, String lastName, String dateBorn, String category) {
        super(id, name, lastName, dateBorn);
        this.category = category;
    }
}
