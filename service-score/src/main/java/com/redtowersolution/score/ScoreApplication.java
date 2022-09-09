package com.redtowersolution.score;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class ScoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScoreApplication.class, args);
        System.out.println("*--- SERVICE QUERY SERVER IS UP AND RUNNING ---*");
    }
}
