package com.redtowersolution.statistic.controller;

import com.redtowersolution.common.model.Statistic;
import com.redtowersolution.statistic.repository.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StatisticController {

    //Usamos @Autowired para inyectar el repositorio StatisticRepository a la variable local
    @Autowired
    StatisticRepository statisticRepository;

    @PostMapping("/saveScore")
    public ResponseEntity<List> saveScoreStatistic (@RequestBody List<Statistic> listStatistic ) {
        try {

            //String url = "http://localhost:8090/api/scoreByIdCliente";

            Iterable<Statistic> lStatistic = statisticRepository.saveAll(listStatistic);
            //RestTemplate restTemplate = new RestTemplate();

            //restTemplate.postForObject(url, lStatistic, Statistic.class);

            List<Statistic> actualList = new ArrayList<>();
            lStatistic.forEach(actualList::add);

            return new ResponseEntity<List>(actualList, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}


