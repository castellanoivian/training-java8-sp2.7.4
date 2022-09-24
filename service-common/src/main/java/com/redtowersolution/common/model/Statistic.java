package com.redtowersolution.common.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "db_statistic")
@Getter
@Setter
@NoArgsConstructor
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatistic;

    //@Column(name = "id_cliente")
    private Integer idCliente;

    /*average*/
    //@Column(name = "statistic_score_cliente")
    private Integer statisticScoreCliente;


    public Statistic(Integer idCliente, Integer statisticScoreCliente) {
        this.idCliente = idCliente;
        this.statisticScoreCliente = statisticScoreCliente;
    }

}

