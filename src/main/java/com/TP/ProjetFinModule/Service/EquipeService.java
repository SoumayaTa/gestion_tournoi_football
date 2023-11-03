package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {
    @Autowired
    EquipeRepository er;

    public List<Equipe> getAllEquipes() {
        return er.findAll();
    }

    public Equipe addEquipe(Equipe equipe) {
        return er.save(equipe);
    }

    public void deleteEquipe(Long id) {
        er.deleteById(id);
    }

    public Equipe updateEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
