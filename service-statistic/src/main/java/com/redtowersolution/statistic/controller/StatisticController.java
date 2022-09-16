package com.redtowersolution.statistic.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticController {
    @PostMapping("/saveScore")

    public String saveStatistic() {

        return "has hecho una peticion post";

    }

}


