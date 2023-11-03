package com.TP.ProjetFinModule.Service;

import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Repository.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StadeService {
    @Autowired
    StadeRepository sr;


    public List<Stade> getAllStades(){
        return sr.findAll();
    }

    public Stade addStade(Stade stade){
        return sr.save(stade);
    }

    public void deleteStade(Long id){
        sr.deleteById(id);
    }


    public Stade updateStade(Stade stade) {
        return sr.save(stade);
    }
}
