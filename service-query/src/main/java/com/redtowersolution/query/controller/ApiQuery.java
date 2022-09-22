package com.redtowersolution.query.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiQuery {

    @GetMapping("/scoreByIdCliente")
        public List<Object> getScoresByIdCliente(@RequestParam("clienteID") int clienteID){
        RestTemplate restTemplate = new RestTemplate();
        String urlScore = "https://localhost:8080/scoresByIdCliente/{clienteID}";
        Object[] scoreArray = restTemplate.getForObject(urlScore, Object[].class, clienteID);
        assert scoreArray != null;
        return Arrays.asList(scoreArray);
    }

}
