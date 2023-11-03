package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Match;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Repository.ArbitreRepository;
import com.TP.ProjetFinModule.Repository.MatchRepository;
import com.TP.ProjetFinModule.Repository.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    MatchRepository mr;
    @Autowired
    ArbitreRepository ar;
    @Autowired
    StadeRepository sr;

    public List<Match> getAllMatchs(){
        return mr.findAll();
    }


    public Match addMatch(Match match, Long idArbitre, Long idStade) {
        Arbitre arbitre = ar.findById(idArbitre).get();
        Stade stade = sr.findById(idStade).get();
            match.setArbitre(arbitre);
            match.setStade(stade);
            return mr.save(match);
    }

    public void deleteMatch(Long id) {
        mr.deleteById(id);
    }

    public Match updateMatch(Match match) {
        return mr.save(match);
    }
}
