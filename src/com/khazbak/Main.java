package com.khazbak;

import com.khazbak.player.Player;
import com.khazbak.player.PlayerDomain;
import com.khazbak.player.Question;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Question> questions=new ArrayList<>();
        questions.add(new Question("do you like this program"));
        questions.add(new Question("do you love mr ahmed elbe7ery"));
        questions.add(new Question("do you like the school laptop"));
        questions.add(new Question("do you enjoy staying at mica"));
        questions.add(new Question("do you go to school"));

        Player player = new Player(questions);
        PlayerDomain domain=new PlayerDomain(player);
            domain.askAll();
        System.out.println("===========================");
    Renderer.renderResult(questions);
    }

}
