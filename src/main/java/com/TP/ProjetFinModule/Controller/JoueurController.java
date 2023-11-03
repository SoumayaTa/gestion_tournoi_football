package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Entity.Joueur;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class JoueurController {
    @Autowired
    JoueurService js;

    @GetMapping("/allJoueurs")
    public List<Joueur> getAllJoueuers(){
        return js.getAllJoueurs();
    }
    @PostMapping("/addJoueur")
    public Joueur addJoueur(@RequestBody Joueur joueur){
        return js.addJoueur(joueur);
    }

    @DeleteMapping("/deleteJoueur/{id}")
    public void deleteJoueur(@PathVariable Long id){
        js.deleteJoueur(id);
    }

    @PutMapping("/updateJoueur")
    public Joueur updateJoueur(@RequestBody Joueur joueur){
        return  js.updateJoueur(joueur);
    }
}
