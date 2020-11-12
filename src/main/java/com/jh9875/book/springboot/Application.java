package com.jh9875.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    //test2
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
