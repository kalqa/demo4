package com.example.demo;

import com.example.demo.model.Journal;
import com.example.demo.model.Umbrella;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Umbrella umbrella() {
        Umbrella umbrella = new Umbrella("umbrella1");
        System.out.println("Created umbrella: " + umbrella);
        return umbrella;
    }

    @Bean
    Umbrella umbrella2() {
        Umbrella umbrella = new Umbrella("umbrella2");
        System.out.println("Created umbrella2: " + umbrella);
        return umbrella;
    }

    @Bean
    @Primary
    Umbrella umbrella3() {
        return new Umbrella("umbrella3");
    }

//    @Bean
//    Journal journal() {
//        return new Journal();
//    }

    //    @Bean
//    Integer fifteen() {
//        return 15;
//    }

//    @Bean
//    Worker worker(Umbrella umbrella2) {
//        return new Worker(umbrella2);
//    }


}
