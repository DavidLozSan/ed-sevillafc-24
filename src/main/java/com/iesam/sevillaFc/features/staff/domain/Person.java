package com.iesam.sevillaFc.features.staff.domain;

public class Person {
    public final String id;
    public final String name;
    public final String lastName;
    public final String dateBorn;

    public Person (String id, String name, String lastName, String dateBorn) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateBorn = dateBorn;
    }
}
