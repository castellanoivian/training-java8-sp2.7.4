package com.redtowersolution.score.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redtowersolution.score.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer> {
    List<Score> findAllScoreByClienteID(int clienteID);

}
