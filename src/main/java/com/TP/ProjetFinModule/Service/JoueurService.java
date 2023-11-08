package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Entity.Joueur;
import com.TP.ProjetFinModule.Repository.EquipeRepository;
import com.TP.ProjetFinModule.Repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JoueurService {
    @Autowired
    JoueurRepository jr;

    @Autowired
    EquipeRepository er;
    public List<Joueur> getAllJoueurs() {
        return jr.findAll();
    }

    public Joueur addJoueur(Joueur joueur) {
        return jr.save(joueur);
    }

    public void deleteJoueur(Long id) {
        jr.deleteById(id);
    }

    public Joueur updateJoueur(Joueur joueur) {
        return jr.save(joueur);
    }


    public List<Joueur> findJoueurByPosteAndEquipe(String poste, String nomEquipe) {
        List<Joueur> joueurs = new ArrayList<>();
        List<Joueur> joueursByPoste = jr.findJoueurByPoste(poste);
        Long idEquipe = er.findIdEquipeByNomEquipe(nomEquipe);
        Equipe equipe = er.findEquipeByIdEquipe(idEquipe);
            for (Joueur joueur : joueursByPoste) {
                if (joueur.getEquipe().equals(equipe)) {
                    joueurs.add(joueur);
                }
            }
            return joueurs;
    }
}
