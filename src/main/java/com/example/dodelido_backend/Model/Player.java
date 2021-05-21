package com.example.dodelido_backend.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {

    public final String name;
    public int score;

    public Player(@JsonProperty("name") String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(@JsonProperty("score")int score) {
        this.score = score;
    }
}
