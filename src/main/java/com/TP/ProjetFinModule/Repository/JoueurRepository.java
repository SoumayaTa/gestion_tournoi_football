package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
