package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Match;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StadeController {
    @Autowired
    StadeService ss;

    @GetMapping("/allStades")
    public List<Stade> getAllStades(){
        return ss.getAllStades();
    }

    @PostMapping("/addStade")
    public Stade addStade(@RequestBody Stade stade){
        return ss.addStade(stade);
    }
    @DeleteMapping("/deleteStade/{id}")
    public void deleteStade(@PathVariable Long id){
        ss.deleteStade(id);
    }

    @PutMapping("/updateStade")
    public Stade updateStade(@RequestBody Stade stade){
        return  ss.updateStade(stade);
    }
}
