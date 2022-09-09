package com.redtowersolution.statistic.service;

import com.redtowersolution.statistic.model.Statistic;

import java.util.ArrayList;
import java.util.Optional;

public interface StatisticService {

    /*devolver todos los estadisticos de la bd */
    ArrayList<Statistic> getAllStatistic();

    /* encontrar el estadistico por id */
    Optional<Statistic> getStatisticById(Integer id_statistic);
    Statistic saveStatistic(Statistic s);
    boolean deleteStatisticById(Integer id_statistic);
}
