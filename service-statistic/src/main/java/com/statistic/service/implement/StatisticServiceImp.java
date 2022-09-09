package com.statistic.service.implement;

import com.statistic.model.Statistic;
import com.statistic.repository.StatisticRepository;
import com.statistic.service.StatisticService;
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


    @Override
    public boolean deleteStatisticById(Integer id_statistic) {
        try {
            Optional<Statistic> s = getStatisticById(id_statistic);
            statisticRepository.delete(s.get());
            return true;
        }catch (Exception e){
            return  false;
        }

    }
}
