package com.pablo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.pablo.repo")
@EntityScan("com.pablo.entity")
public class LearnJS {
    public static void main(String[] args) {
        SpringApplication.run(LearnJS.class, args);
    }

}
