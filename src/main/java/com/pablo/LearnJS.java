package com.pablo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pablo.entity")
public class LearnJS {
    public static void main(String[] args) {
        SpringApplication.run(LearnJS.class, args);
    }

}
