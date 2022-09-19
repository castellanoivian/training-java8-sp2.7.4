package com.redtowersolution.score.model;
import javax.persistence.*;

@Entity
@Table(name = "db_score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_score;
    @Column(name = "clienteID")
    private Integer clienteID;
    @Column(name = "score")
    private Integer score;

    public Score(Integer id_score, Integer clienteID, Integer score) {
        this.id_score = id_score;
        this.clienteID = clienteID;
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

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
