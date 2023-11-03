package com.TP.ProjetFinModule.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEquipe;
        private String nomEquipe;
        private String pays;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    List<Joueur> joueurs;

}
