package com.example.demo.model;

import javax.annotation.PostConstruct;

//@Component
public class Umbrella {

    private String name;

    public Umbrella(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
