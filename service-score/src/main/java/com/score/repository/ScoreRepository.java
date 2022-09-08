package com.score.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.score.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer> {
}
