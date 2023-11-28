package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
@Entity
@IdClass(PersonId.class)

public class Person {
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

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname= surname;
        this.age = age;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Integer.parseInt(phoneNumber);
    }
    public String getCityOfLiving() {
        return cityOfLiving;
    }
    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

}