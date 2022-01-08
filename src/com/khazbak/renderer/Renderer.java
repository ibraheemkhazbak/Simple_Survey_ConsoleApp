package com.khazbak.renderer;

import com.khazbak.player.Question;

import java.util.List;

public class Renderer implements IRenderer {
    public void renderQuestion(Question question){
        System.out.println(question.getText()+" (y/n)");
    }

    public void renderResult(List<Question> questions){
        System.out.println("===========================");
        System.out.println("Result");
        for (Question question: questions) {
            renderQuestion(question);
            System.out.println(question.getAnswered());
        }

    }
}
