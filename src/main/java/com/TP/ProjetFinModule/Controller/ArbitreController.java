package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Service.ArbitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ArbitreController {
    @Autowired
    ArbitreService as;

    @GetMapping("/allArbitres")
    public List<Arbitre> getAllArbitres (){
       return as.getAllArbitres();
    }

    @PostMapping("/addArbitre")
    public Arbitre addArbitre(@RequestBody Arbitre arbitre){
        return as.addArbitre(arbitre);
    }

    @DeleteMapping("/deleteArbitre/{id}")
    public void deleteArbitre(@PathVariable Long id){
        as.deleteArbitre(id);
    }
    @PutMapping("/updateArbitre")
    public Arbitre updateArbitre(@RequestBody Arbitre arbitre){
       return  as.updateArbitre(arbitre);
    }
}
