package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Repository.ArbitreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArbitreService {
    @Autowired
    ArbitreRepository ar;

    public List<Arbitre> getAllArbitres() {
        return ar.findAll();
    }

    public Arbitre addArbitre(Arbitre arbitre) {
        return ar.save(arbitre);
    }

    public void deleteArbitre(Long id) {
        ar.deleteById(id);
    }


    public Arbitre updateArbitre(Arbitre arbitre) {
        return ar.save(arbitre);
    }
}
