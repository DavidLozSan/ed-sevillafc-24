package com.iesam.sevillaFc.features.staff.domain;

public class Doctor extends Person {
    public final String specialty;
    public Doctor(String id, String name, String lastName, String dateBorn, String specialty) {
        super(id, name, lastName, dateBorn);
        this.specialty = specialty;
    }
}
