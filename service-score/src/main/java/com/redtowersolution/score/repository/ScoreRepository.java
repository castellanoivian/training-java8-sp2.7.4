package com.redtowersolution.score.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redtowersolution.score.model.Score;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer>{
    Optional<Score>getScoresById(Integer id_score);
        /*extends CrudRepository<Score, Integer> {
    @Query("SELECT scores FROM Score scores " +
            "WHERE scores.id_cliente = :id_cliente ")
    Optional<Score> mostrarScore(@Param("id_cliente")Integer id_cliente);*/

}
