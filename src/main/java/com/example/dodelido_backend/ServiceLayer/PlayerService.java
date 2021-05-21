package com.example.dodelido_backend.ServiceLayer;

import com.example.dodelido_backend.DAO.DAOPlayer;
import com.example.dodelido_backend.Model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlayerService {

    DAOPlayer daoPlayer = new DAOPlayer();

    public int addPlayer(Player player) {
        return daoPlayer.addPlayer(player);
    }

    public int getIndexByName(String name) {
        return daoPlayer.getIndexByName(name);
    }

    public String getName(int playerIndex) {
        return daoPlayer.getName(playerIndex);
    }

    public int getScore(int playerIndex) {
        return daoPlayer.getScore(playerIndex);
    }

    public void setScore(int playerIndex, int score) {
        daoPlayer.setScore(playerIndex, score);
    }

    public ArrayList<Player> getAllPlayer() {
        return daoPlayer.getAllPlayer();
    }

}
