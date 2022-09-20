package com.redtowersolution.query.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiQuery {

    @GetMapping("/scoreByIdCliente")
    public List<Object> getScoresByIdCliente(@RequestParam int clienteID){
        String urlScore = "https://localhost:8080/scoresByIdCliente/"+clienteID;
        RestTemplate restTemplate = new RestTemplate();
        Object[] scoreArray = restTemplate.getForObject(urlScore, Object[].class);
        if (scoreArray != null)
            return Arrays.asList(scoreArray);
        else
            return null;
    }

}
