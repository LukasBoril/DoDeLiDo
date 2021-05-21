package com.example.dodelido_backend.API;

import com.example.dodelido_backend.Model.Player;
import com.example.dodelido_backend.ServiceLayer.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("Dodelido/v1/player")

@RestController()
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // tested
    @PostMapping("/add")
    public void addPlayer(@RequestBody Player player) throws Exception {
        int success = playerService.addPlayer(player);
        if (success==0) {
            throw new Exception();
        }
    }

    // tested
    @PostMapping(path = "/setScore/{playerIndex}/{score}")
    public void setScore(@PathVariable int playerIndex, @PathVariable int score) {
        playerService.setScore(playerIndex, score);
    }


    // tested
    @GetMapping
    public ArrayList<Player> getAllPlayer() {
        return playerService.getAllPlayer();
    }


    // tested
    @GetMapping("/getIndex")
    public int getIndexByName(@RequestBody String name)  {
        int success = playerService.getIndexByName(name);
        if (success==-1) {
            System.out.println("Person not found");
            return success;
        }
        else { return success; }
    }

    // tested
    @GetMapping("/getName")
    public String getName(@RequestBody int playerIndex) throws Exception {
        String success = playerService.getName(playerIndex);
        if (success.isEmpty()) {
            throw new Exception();
        }
        else {return success;}
    }

    // tested
    @GetMapping(path = "/getScore/{playerIndex}")
    public int getScore(@PathVariable int playerIndex) throws Exception {
        int success = playerService.getScore(playerIndex);
        if (success==-1) {
            throw new Exception();
        }
        else {return success;}
    }

    }
