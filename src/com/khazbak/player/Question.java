package com.khazbak.player;

public class Question {
    String text;
    char answered;
    public Question(String question) {
        this.text = question;
    }

    public String getText() {
        return text;
    }

    public char getAnswered() {
        return answered;
    }

    public void setAnswered(char answered) {
        this.answered = answered;
    }
}
