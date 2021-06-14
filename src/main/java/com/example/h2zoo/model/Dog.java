package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String breed;
    private final String color;
    private final String dietType;

    public Dog(String name, String breed, String color, String dietType) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.dietType = dietType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getDietType() {
        return dietType;
    }
}

