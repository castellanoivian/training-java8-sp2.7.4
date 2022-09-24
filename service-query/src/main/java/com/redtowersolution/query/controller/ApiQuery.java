package com.redtowersolution.query.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiQuery {

    @GetMapping("/scoreByIdCliente")
    public void getScoresByIdCliente(@RequestParam("clienteID") int clienteID){
        RestTemplate restTemplate = new RestTemplate();
        String urlScore = "http://localhost:8080/viewScoreIdCliente/{clienteID}";
        Object[] scoreArray = restTemplate.getForObject(urlScore, Object[].class, clienteID);
        List<Object> listStatistic = Arrays.asList(scoreArray);
        String urlStatistic = "http://localhost:5658/saveScore";
        restTemplate.postForObject(urlStatistic, listStatistic, Object.class);
    }

}
