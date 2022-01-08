package com.khazbak;

import com.khazbak.inputgrabber.IInputGrabber;
import com.khazbak.inputgrabber.InputGrabber;
import com.khazbak.player.Player;
import com.khazbak.player.PlayerDomain;
import com.khazbak.player.Question;
import com.khazbak.renderer.IRenderer;
import com.khazbak.renderer.Renderer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Question> questions = initQuestions();
        Player player = new Player(questions);

        IRenderer renderer=new Renderer();
        PlayerDomain domain=initPlayerDomain(renderer,player);

            domain.askAll();
            renderer.renderResult(questions);
    }
    private static PlayerDomain initPlayerDomain(IRenderer renderer,Player player) {
        IInputGrabber inputGrabber=new InputGrabber();
        PlayerDomain domain=new PlayerDomain(renderer,inputGrabber,player);
        return domain;
    }

    private static ArrayList<Question> initQuestions() {
        ArrayList<Question> questions=new ArrayList<>();
        questions.add(new Question("do you like this program"));
        questions.add(new Question("do you like the school laptop"));
        questions.add(new Question("do you enjoy staying at mica"));
        questions.add(new Question("do you go to school"));
        return questions;
    }

}
