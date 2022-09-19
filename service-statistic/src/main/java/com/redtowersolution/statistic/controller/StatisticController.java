package com.redtowersolution.statistic.controller;

import com.redtowersolution.statistic.model.Statistic;
import com.redtowersolution.statistic.repository.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StatisticController {

    //Usamos @Autowired para inyectar el repositorio StatisticRepository a la variable local
    @Autowired
    StatisticRepository statisticRepository;

    @PostMapping("/saveScore")
    public ResponseEntity<Statistic> saveScoreStatistic (@RequestBody Statistic varStatistic) {
        try {

            String url = "https://localhost:8090/api/scoreByIdCliente";
            Statistic vStatistic = statisticRepository
                    .save(new Statistic(varStatistic.getIdCliente(), varStatistic.getStatisticScoreCliente()));
            RestTemplate restTemplate = new RestTemplate();

            restTemplate.postForObject(url, vStatistic, Statistic.class);

            return new ResponseEntity<>(vStatistic, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}


