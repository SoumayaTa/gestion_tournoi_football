package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Joueur;
import com.TP.ProjetFinModule.Repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurService {
    @Autowired
    JoueurRepository jr;

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
}
