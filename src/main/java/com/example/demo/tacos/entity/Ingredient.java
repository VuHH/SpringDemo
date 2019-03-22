package com.example.demo.tacos.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;

@Data
//@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {

    @Id
    private final String id;

    private final String name;
    private final Type type;

//    public Ingredient() {
//        id = null;
//        name = null;
//        type = null;
//    }

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

//    public Ingredient(String id, String name, Type type) {
//        this.id = id;
//        this.name = name;
//        this.type = type;
//    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
