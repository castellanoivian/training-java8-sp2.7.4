package com.redtowersolution.statistic.repository;


import com.redtowersolution.common.model.Statistic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticRepository extends CrudRepository<Statistic, Integer> {

}
