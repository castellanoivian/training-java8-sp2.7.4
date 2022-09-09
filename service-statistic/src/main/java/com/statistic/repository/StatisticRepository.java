package com.statistic.repository;

/*para utilizar los metodos de persistencia*/

import org.springframework.data.jpa.repository.JpaRepository;
import com.statistic.model.Statistic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticRepository extends CrudRepository<Statistic, Integer> {
}
