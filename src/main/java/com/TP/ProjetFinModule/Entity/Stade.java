package com.TP.ProjetFinModule.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idStade;
    String nomStade;
    String ville;


    @OneToMany(mappedBy = "stade", cascade = CascadeType.ALL)
    List<Match> matchs;

    @Override
    public int hashCode() {
        return Objects.hash(idStade, nomStade, ville);
    }
}
