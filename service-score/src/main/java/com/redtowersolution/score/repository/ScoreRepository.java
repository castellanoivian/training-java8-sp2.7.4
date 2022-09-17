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
    /*Optional<Score> findAllById(Integer id_cliente);
        extends CrudRepository<Score, Integer> {
    @Query("SELECT scores FROM Score scores " +
            "WHERE scores.id_cliente = :id_cliente ")
    Optional<Score> mostrarScore(@Param("id_cliente")Integer id_cliente);*/

}
