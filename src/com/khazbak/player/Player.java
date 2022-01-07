package com.khazbak.player;

import java.util.List;

public class Player {
    private String _name;
   public List<Question> questions;

    public Player(List<Question> questions) {
        this.questions = questions;
    }
}
