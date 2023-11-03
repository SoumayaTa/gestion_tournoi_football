package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadeRepository extends JpaRepository<Stade, Long> {
}
