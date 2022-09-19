package com.redtowersolution.statistic.model;


import javax.persistence.*;

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
    private Integer statistic_score_cliente;


    /*creando un constructor vacio*/
    public Statistic(Integer idCliente, Integer statisticScoreCliente) {

    }

    public Statistic(Integer id_statistic, Integer id_cliente, Integer statistic_score_cliente) {
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

    public Integer getStatisticScoreCliente() {
        return statistic_score_cliente;
    }

    public void setStatisticScoreCliente(Integer statistic_score_cliente) {
        this.statistic_score_cliente = statistic_score_cliente;
    }


}
