package ru.netology.hibernate.entity;

import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PersonId implements Serializable {
    private final String name;
    private final String surname;
    private final int age;

    public PersonId(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonId personId = (PersonId) o;
        return name.equals(personId.name) &&
               surname.equals(personId.surname) &&
                Objects.equals(age, personId.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
