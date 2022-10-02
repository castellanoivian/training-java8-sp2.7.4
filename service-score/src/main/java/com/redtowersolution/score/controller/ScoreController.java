package com.redtowersolution.score.controller;
import com.redtowersolution.score.repository.ScoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.redtowersolution.common.model.score.Score;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScoreController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello Mundo";
    }
    @Autowired
    ScoreRepository scoreRepository;

    @PostMapping("/saveScore")
    public void saveScore(@RequestBody Score s) {
        scoreRepository.save(s);
    }
    @GetMapping("/viewScore")
    public ResponseEntity<List<Score>> viewScores() {
        try {
            List<Score> scores = (List<Score>) scoreRepository.findAll();
            if (scores.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(scores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    /*@GetMapping("/viewScoreIdCliente/{clienteID}")
    public List<Score> byIdCliente(@PathVariable("clienteID") int clienteID) {
        return scoreRepository.findAllScoreByClienteID(clienteID);
    }*/
   @GetMapping(value = "/viewScoreIdClientes/{listClienteID}")
    public List<Score> byIdClientes(@PathVariable List<Integer> listClienteID) {
       List<Score> scoresListID = new ArrayList<>();
        for (Integer scores : listClienteID){
            List<Score> scoresList = new ArrayList<>();
            scoresList = scoreRepository.findAllScoreByClienteID(scores);
            scoresList.forEach(scoresListID::add);
            }
           return scoresListID;
    }
}
