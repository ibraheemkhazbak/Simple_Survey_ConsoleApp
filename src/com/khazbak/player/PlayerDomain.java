package com.khazbak.player;

import com.khazbak.AnswerGrabber;
import com.khazbak.Renderer;
import com.khazbak.player.Player;

public class PlayerDomain {
    public Player player;
    public PlayerDomain(Player player) {
        this.player=player;
    }
    public void askAll(){
        boolean isYes;
        for (Question question: player.questions) {
            isYes=ask(question);

            if(isYes){
                question.setAnswered('y');
            }else{
                question.setAnswered('n');
            }


        }

    }


    public boolean ask(Question question){
        boolean isYes=false;
        Renderer.renderQuestion(question);
        isYes=getAnswer(question);
    return isYes;
    }

    private boolean getAnswer(Question question) {
        boolean answer;
    while (true){
        try{
            answer= AnswerGrabber.getBoolean(question.text);
            break;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    return answer;
    }
}
