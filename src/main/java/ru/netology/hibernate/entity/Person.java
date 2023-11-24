package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
@Entity
@IdClass(Person.class)

public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name="phone_number")
    private int phoneNumber;
    @Column(name="city_of_living")
    private String cityOfLiving;
}