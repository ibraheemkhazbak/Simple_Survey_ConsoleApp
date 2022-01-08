package com.khazbak.player;

import com.khazbak.inputgrabber.IInputGrabber;
import com.khazbak.inputgrabber.InputGrabber;
import com.khazbak.renderer.IRenderer;

public class PlayerDomain {
    public Player player;
    private IRenderer _renderer;
    private IInputGrabber _inputGrabber;
    public PlayerDomain(IRenderer renderer,IInputGrabber inputGrabber,Player player) {
        this.player=player;
        this._renderer=renderer;
        this._inputGrabber=inputGrabber;
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
        _renderer.renderQuestion(question);
        isYes=getAnswer(question);
    return isYes;
    }

    private boolean getAnswer(Question question) {
        boolean answer;
    while (true){
        try{
            answer= _inputGrabber.getBoolean(question.text);
            break;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    return answer;
    }
}
