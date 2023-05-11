package com.example.demo;

import com.example.demo.model.Umbrella;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    private final Umbrella someUmbrella;

    Worker(Umbrella someUmbrella) {
        this.someUmbrella = someUmbrella;
    }

    public void work() {
        System.out.println("working with " + someUmbrella.getName());
    }
}
