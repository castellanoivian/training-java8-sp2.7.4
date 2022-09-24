package com.redtowersolution.score.repository;
import org.springframework.data.repository.CrudRepository;
import  com.redtowersolution.common.model.Score;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer> {
    List<Score> findAllScoreByClienteID(int clienteID);

}
