package com.iesam.sevillaFc.features.staff.domain;

public class Coach extends Person {
    public final String strategy;
    public Coach(String id, String name, String lastName, String dateBorn, String strategy) {
        super(id, name, lastName, dateBorn);
        this.strategy = strategy;
    }
}
