package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Entity.Joueur;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Service.EquipeService;
import com.TP.ProjetFinModule.Service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EquipeController {

    @Autowired
    EquipeService es;

    @GetMapping("/allEquipes")
    public List<Equipe> getAllEquipes(){
        return es.getAllEquipes();
    }

    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return es.addEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{id}")
    public void deleteEquipe(@PathVariable Long id){
        es.deleteEquipe(id);
    }

    @PutMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe equipe){
        return  es.updateEquipe(equipe);
    }

    @GetMapping("/getByPays/{pays}")
    public List<Equipe> getByPays(@PathVariable String pays){
       return es.getAllByPays(pays);
    }

    @GetMapping("/getAllJoueurs/{nomEquipe}")
    public List<Joueur> getAllJoueurs(@PathVariable String nomEquipe){
        return es.getAllByNomEquipe(nomEquipe);
    }
}
