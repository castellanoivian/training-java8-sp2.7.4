package com.redtowersolution.score.service;
import com.redtowersolution.score.model.Score;

import java.util.ArrayList;
import java.util.Optional;

public interface ScoreService {
    ArrayList<Score>getAllScore();
    Optional<Score>getScoreById(Integer id_score);
    Optional<Score>findAllById(Integer id_cliente);



}
