package com.TP.ProjetFinModule.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="`Match`")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idMatch;
        private Date dateMatch;
        private Time heurMatch;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "arbitre_id")
    private Arbitre arbitre;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "stade_id")
    private Stade stade;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "equipe_match")
    private List<Equipe> equipe;

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, dateMatch, heurMatch);
    }

}
