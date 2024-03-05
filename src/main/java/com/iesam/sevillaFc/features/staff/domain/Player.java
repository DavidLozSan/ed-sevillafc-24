package com.iesam.sevillaFc.features.staff.domain;

public class Player extends Person {
    public final String demarcation;

    public Player(String id, String name, String lastName, String dateBorn, String demarcation) {
        super(id, name, lastName, dateBorn);
        this.demarcation = demarcation;
    }
}
