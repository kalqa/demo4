package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Demo4Application {

    @Autowired
    Worker worker;

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void runWhenApplicationStart(){
//        Worker worker = new Worker();
        worker.work();
    }

}
