package com.redtowersolution.statistic.service.implement;

import com.redtowersolution.statistic.model.Statistic;
import com.redtowersolution.statistic.repository.StatisticRepository;
import com.redtowersolution.statistic.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StatisticServiceImp implements StatisticService {

    /*inyectar el repositorio*/
    @Autowired
    StatisticRepository statisticRepository;


    @Override
    public ArrayList<Statistic> getAllStatistic() {

        return (ArrayList<Statistic>) statisticRepository.findAll();
    }

    @Override
    public Optional<Statistic> getStatisticById(Integer id_statistic) {
        return statisticRepository.findById(id_statistic);
    }

    @Override
    public Statistic saveStatistic(Statistic s) {

        return statisticRepository.save(s);
    }


}
