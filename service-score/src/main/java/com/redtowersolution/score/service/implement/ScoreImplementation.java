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

    @Override
    public Optional<Score> getScoreById(Integer id_score) {
        return scoreRepository.findById(id_score);
    }

    @Override
    public Score saveScore(Score score) {
        return scoreRepository.save(score);
    }

    @Override
    public boolean deleteScorebyID(Integer id_score) {
        try{
            Optional<Score>score = getScoreById(id_score);
            scoreRepository.delete(score.get());
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
