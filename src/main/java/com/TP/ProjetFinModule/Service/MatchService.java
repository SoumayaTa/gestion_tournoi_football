package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Entity.Match;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Repository.ArbitreRepository;
import com.TP.ProjetFinModule.Repository.EquipeRepository;
import com.TP.ProjetFinModule.Repository.MatchRepository;
import com.TP.ProjetFinModule.Repository.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    MatchRepository mr;
    @Autowired
    ArbitreRepository ar;
    @Autowired
    StadeRepository sr;

    @Autowired
    EquipeRepository er;

    public List<Match> getAllMatchs(){
        return mr.findAll();
    }


    public Match addMatch(Match match, Long idArbitre, Long idStade, Long idEquipeDom, Long idEquipeExte) {
        Arbitre arbitre = ar.findById(idArbitre).get();
        Stade stade = sr.findById(idStade).get();
        Equipe equipe = er.findById(idEquipeDom).get();
        Equipe equipe1 = er.findById(idEquipeExte).get();
            match.setArbitre(arbitre);
            match.setStade(stade);
            match.setEquipeDomicile(equipe);
            match.setEquipeExterieur(equipe1);
            return mr.save(match);
    }

    public void deleteMatch(Long id) {
        mr.deleteById(id);
    }

    public Match updateMatch(Match match) {
        return mr.save(match);
    }

    public List<Match> getAllByDateMatch(Date dateMatch){
        return mr.getAllByDateMatch(dateMatch);
    }

    public Stade getStadeByIdMatch(Long idMatch){
        Optional<Match> matchOptional = mr.findById(idMatch);
            Match match = matchOptional.get();
            return match.getStade();
    }
    public List<Equipe> getAllByIdMatch(Long idMatch){
        Optional<Match> matchOptional = mr.findById(idMatch);
            Match match = matchOptional.get();
            List<Equipe> equipes = new ArrayList<>();
            equipes.add(match.getEquipeDomicile());
            equipes.add(match.getEquipeExterieur());
            return equipes;
    }
    public void deleteAncienMatch(){
        java.util.Date utilDate = new java.util.Date();
        Date currentDate = new Date(utilDate.getTime());
        List<Match> pastMatches = mr.findByDateMatchBefore(currentDate);
        mr.deleteAll(pastMatches);
    }


}
