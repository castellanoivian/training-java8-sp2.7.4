package com.statistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class StatisticApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatisticApplication.class, args);
        System.out.println("*--- SERVICE QUERY SERVER IS UP AND RUNNING ---*");
    }
}
