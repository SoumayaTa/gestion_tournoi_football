package com.TP.ProjetFinModule.Repository;

import com.TP.ProjetFinModule.Entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    List<Equipe> findAllByPays(String pays);
    @Query("SELECT e.idEquipe FROM Equipe e WHERE e.nomEquipe = :nomEquipe")
    Long findIdEquipeByNomEquipe(@Param("nomEquipe") String nomEquipe);

    Equipe findEquipeByIdEquipe(Long idEquipe);
}
