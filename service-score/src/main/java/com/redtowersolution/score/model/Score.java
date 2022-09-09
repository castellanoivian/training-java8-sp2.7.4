package com.redtowersolution.score.model;
import javax.persistence.*;

@Entity
@Table(name = "db_score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_score;
    @Column(name = "id_cliente")
    private Integer id_cliente;
    @Column(name = "score")
    private Integer score;

    public Score(Integer id_score, Integer id_cliente, Integer score) {
        this.id_score = id_score;
        this.id_cliente = id_cliente;
        this.score = score;
    }

    public Score() {
    }


    public Integer getId_score() {
        return id_score;
    }

    public void setId_score(Integer id_score) {
        this.id_score = id_score;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
