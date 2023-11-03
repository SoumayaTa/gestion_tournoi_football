package com.TP.ProjetFinModule.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
}
