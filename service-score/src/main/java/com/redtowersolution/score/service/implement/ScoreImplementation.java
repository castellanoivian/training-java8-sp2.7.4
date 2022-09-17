package com.redtowersolution.score.service.implement;
import com.redtowersolution.score.repository.ScoreRepository;
import com.redtowersolution.score.model.Score;
import com.redtowersolution.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ScoreImplementation implements ScoreService{
    @Autowired
    ScoreRepository scoreRepository;
    @Override
    public ArrayList<Score> getAllScore() {
        return (ArrayList<Score>) scoreRepository.findAll();
    }
    public Optional<Score> findAllById(Integer id_cliente) {
        return scoreRepository.findById(id_cliente);
    }
    @Override
    public Optional<Score> getScoreById(Integer id_score) {
        return scoreRepository.findById(id_score);
    }




}
