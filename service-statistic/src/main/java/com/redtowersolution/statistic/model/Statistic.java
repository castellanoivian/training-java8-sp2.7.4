package com.redtowersolution.statistic.model;


import javax.persistence.*;

@Entity
@Table (name = "db_statistic")

public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatistic;

    //@Column(name = "id_cliente")
    private Integer idCliente;

    /*average*/
    //@Column(name = "statistic_score_cliente")
    private Integer statisticScoreCliente;


    /*creando un constructor vacio*/
    public Statistic() {

    }

    public Statistic(Integer idStatistic, Integer idCliente, Integer statisticScoreCliente) {
        this.idStatistic = idStatistic;
        this.idCliente = idCliente;
        this.statisticScoreCliente = statisticScoreCliente;
    }

    public Integer getIdStatistic() {
        return idStatistic;
    }

    public void setIdStatistic(Integer idStatistic) {
        this.idStatistic = idStatistic;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getStatisticScoreCliente() {
        return statisticScoreCliente;
    }

    public void setStatisticScoreCliente(Integer statisticScoreCliente) {
        this.statisticScoreCliente = statisticScoreCliente;
    }
}

