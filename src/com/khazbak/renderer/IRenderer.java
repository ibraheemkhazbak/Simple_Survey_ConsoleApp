package com.khazbak.renderer;

import com.khazbak.player.Question;

import java.util.List;

public interface IRenderer {
     void renderQuestion(Question question);
     void renderResult(List<Question> questions);
}
