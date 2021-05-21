package com.example.dodelido_backend.DAO;

import com.example.dodelido_backend.Model.Player;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DAOPlayer {

    private ArrayList<Player> players = new ArrayList<>();

    public int addPlayer(Player player) {
        if (player==null) {
            System.out.println("Person can not be null");
            return 0;
        }
        if (players.stream().filter(pla -> pla.getName().equals(player.getName())).findFirst().orElse(null)==null) {
            players.add(player);
            return 1;
        }
        else {
            return 0;
        }
    }

    public int getIndexByName(@JsonProperty("name") String name) {
        Player targetPlayer = players.stream().filter(per -> per.getName().equals(name)).findFirst().orElse(null);
        if (targetPlayer==null) {
            return -1;
        }
        else {
            return players.indexOf(targetPlayer);
        }
    }

    public String getName(@JsonProperty("index") int playerIndex) {
        return players.get(playerIndex).getName();
    }

    public int getScore(int playerIndex) {
        return players.get(playerIndex).getScore();
    }

    public void setScore(@JsonProperty("index") int playerIndex, int score) {
        players.get(playerIndex).setScore(score);
    }

    public ArrayList<Player> getAllPlayer() {
        return players;
    }

}
