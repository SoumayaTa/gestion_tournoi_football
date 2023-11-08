package com.TP.ProjetFinModule.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(idEquipe, nomEquipe, pays);
    }
}
