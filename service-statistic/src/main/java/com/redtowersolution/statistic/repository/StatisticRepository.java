package com.redtowersolution.statistic.repository;

/*para utilizar los metodos de persistencia*/

import com.redtowersolution.statistic.model.Statistic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticRepository extends CrudRepository<Statistic, Integer> {
}
