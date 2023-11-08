package com.TP.ProjetFinModule.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idJoueur;
        private String nomJoueur;
        private String poste;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    @Override
    public int hashCode() {
        return Objects.hash(idJoueur, nomJoueur, poste);
    }
}
