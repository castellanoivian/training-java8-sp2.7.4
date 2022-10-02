package com.redtowersolution.common.model.statistic;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "db_statistic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatistic;

    private Integer idCliente;

    private Integer statisticScoreCliente;

    public Statistic(Integer idCliente, Integer statisticScoreCliente) {
        this.idCliente = idCliente;
        this.statisticScoreCliente = statisticScoreCliente;
    }
}

