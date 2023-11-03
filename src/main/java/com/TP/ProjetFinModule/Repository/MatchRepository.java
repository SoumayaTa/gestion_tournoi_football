package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}
