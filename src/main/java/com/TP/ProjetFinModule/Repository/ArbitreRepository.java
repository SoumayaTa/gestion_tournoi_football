package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Arbitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbitreRepository extends JpaRepository<Arbitre, Long> {
}
