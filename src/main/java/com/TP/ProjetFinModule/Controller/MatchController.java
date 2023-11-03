package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Match;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MatchController {

    @Autowired
    MatchService ms;

    @GetMapping("/allMatchs")
    public List<Match> getAllMatchs(){
        return ms.getAllMatchs();
    }
    @PostMapping("/addMatch/{idArbitre}/{idStade}")
    public Match addMatch(@RequestBody Match match,@PathVariable Long idArbitre, @PathVariable Long idStade){
        return ms.addMatch(match, idArbitre, idStade);
    }
    @DeleteMapping("/deleteMatch/{id}")
    public void deleteMatch(@PathVariable Long id){
        ms.deleteMatch(id);
    }

    @PutMapping("/updateMatch")
    public Match updateMatch(@RequestBody Match match){
        return  ms.updateMatch(match);
    }
}
