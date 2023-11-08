package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findJoueurByPoste(String poste);
}
