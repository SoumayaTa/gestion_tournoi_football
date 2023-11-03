package com.TP.ProjetFinModule.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Arbitre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idArbitre;
    String nom;
    String Nationalité;

    @OneToMany(mappedBy = "arbitre", cascade = CascadeType.ALL)
    List<Match> matchs;

    @Override
    public int hashCode() {
        return Objects.hash(idArbitre, nom, Nationalité);
    }
}
