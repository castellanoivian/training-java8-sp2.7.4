package com.redtowersolution.statistic.repository;

/*para utilizar los metodos de persistencia*/

import com.redtowersolution.statistic.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Integer> {
}
