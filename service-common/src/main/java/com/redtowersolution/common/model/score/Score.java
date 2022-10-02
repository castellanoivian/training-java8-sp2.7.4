package com.redtowersolution.common.model.score;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "db_score")
@Getter
@Setter
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_score;
    @Column(name = "clienteID")
    private Integer clienteID;
    @Column(name = "score")
    private Integer score;

    public Score(Integer clienteID, Integer score) {
        this.clienteID = clienteID;
        this.score = score;
    }
}
