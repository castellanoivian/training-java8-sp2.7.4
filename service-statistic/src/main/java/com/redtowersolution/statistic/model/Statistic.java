package com.redtowersolution.statistic.model;


import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "db_statistic")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_statistic;

    @Column(name = "id_cliente")
    private Integer id_cliente;

    /*average*/
    @Column(name = "statistic_score_cliente")
    private Double statistic_score_cliente;


    /*creando un constructor vacio*/
    public Statistic() {

    }

    public Statistic(Integer id_statistic, Integer id_cliente, Double statistic_score_cliente, String nombre_cliente) {
        this.id_statistic = id_statistic;
        this.id_cliente = id_cliente;
        this.statistic_score_cliente = statistic_score_cliente;

    }

    public Integer getIdStatistic() {
        return id_statistic;
    }

    public void setIdStatistic(Integer id_statistic) {
        this.id_statistic = id_statistic;
    }

    public Integer getIdCliente() {
        return id_cliente;
    }

    public void setIdCliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Double getStatisticScoreCliente() {
        return statistic_score_cliente;
    }

    public void setStatisticScoreCliente(Double statistic_score_cliente) {
        this.statistic_score_cliente = statistic_score_cliente;
    }


}
