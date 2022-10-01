package com.redtowersolution.query.controller;

import com.redtowersolution.common.model.Score;
import com.redtowersolution.common.model.Statistic;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ApiQuery {

    /*@GetMapping("/scoreByIdCliente")
    public List<Statistic> getScoresByIdCliente(@RequestParam("clienteID") int clienteID){
        RestTemplate restTemplate = new RestTemplate();
        String urlScore = "http://localhost:8080/viewScoreIdCliente/{clienteID}";
        Score[] scoreArray = restTemplate.getForObject(urlScore, Score[].class, clienteID);
        List<Score> listScore = Arrays.asList(scoreArray);
        List<Statistic> listStatistic = new ArrayList<>();
        listScore.forEach((n) -> listStatistic.add(new Statistic(n.getClienteID(),n.getScore())));
        String urlStatistic = "http://localhost:5658/saveScore";

        return restTemplate.postForObject(urlStatistic, listStatistic, List.class) ;
    }*/

    @GetMapping("/scoreByIdClientes")
    public List<Statistic> scoresByIdClientes(@RequestParam("clienteID") List<Integer> listClienteID){
        String listOfIds = listClienteID.stream().map(Object::toString).collect(Collectors.joining(","));
        RestTemplate restTemplate = new RestTemplate();
        String urlScore = "http://localhost:7890/viewScoreIdClientes/{listClienteID}";
        Score[] scoreArray = restTemplate.getForObject(urlScore, Score[].class,listOfIds);
        List<Score> listScore = Arrays.asList(scoreArray);
        List<Statistic> listStatistic = new ArrayList<>();
        listScore.forEach((n) -> listStatistic.add(new Statistic(n.getClienteID(),n.getScore())));
        String urlStatistic = "http://localhost:5658/saveScore";

        return restTemplate.postForObject(urlStatistic, listStatistic, List.class);
    }
de
}
