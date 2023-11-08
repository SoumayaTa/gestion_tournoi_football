package com.TP.ProjetFinModule.Controller;

import com.TP.ProjetFinModule.Entity.Arbitre;
import com.TP.ProjetFinModule.Entity.Equipe;
import com.TP.ProjetFinModule.Entity.Match;
import com.TP.ProjetFinModule.Entity.Stade;
import com.TP.ProjetFinModule.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    @PostMapping("/addMatch")
    public Match addMatch(@RequestBody Match match,
                          @RequestParam Long idArbitre,
                          @RequestParam Long idStade,
                          @RequestParam Long idEquipeDom,
                          @RequestParam Long idEquipeExt) {
        return ms.addMatch(match, idArbitre, idStade, idEquipeDom, idEquipeExt);
    }

    @DeleteMapping("/deleteMatch/{id}")
    public void deleteMatch(@PathVariable Long id){
        ms.deleteMatch(id);
    }

    @PutMapping("/updateMatch")
    public Match updateMatch(@RequestBody Match match){
        return  ms.updateMatch(match);
    }

    @GetMapping("/getallbydate/{date}")
    public List<Match> getAllByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") String date) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date datestr = dateFormat.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(datestr.getTime());
            return ms.getAllByDateMatch(sqlDate);
    }

    @GetMapping("/getStadeByIdMatch/{idMatch}")
    public Stade getStadeByIdMatch(@PathVariable Long idMatch){
        return ms.getStadeByIdMatch(idMatch);
    }

    @GetMapping("/getEquipesByIdMatch/{idMatch}")
    public List<Equipe> getEquipesByIdMatch(@PathVariable Long idMatch){
        return ms.getAllByIdMatch(idMatch);
    }
    @DeleteMapping("/deletepreviousmatch")
    public void deleteAncienMatch(){
        ms.deleteAncienMatch();
    }
}
