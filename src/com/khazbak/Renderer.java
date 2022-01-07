package com.khazbak;

import com.khazbak.player.Question;

import java.util.List;

public class Renderer {
    public static void renderQuestion(Question question){
        System.out.println(question.getText()+" (y/n)");
    }

    public static void renderResult(List<Question> questions){
        System.out.println("Result");
        for (Question question: questions) {
            Renderer.renderQuestion(question);
            System.out.println(question.getAnswered());
        }

    }
}
