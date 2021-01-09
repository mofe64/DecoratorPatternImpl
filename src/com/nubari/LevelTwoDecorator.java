package com.nubari;

import java.security.SecureRandom;

public class LevelTwoDecorator extends QuestionDecorator {
    Question question;

    public LevelTwoDecorator(Question question) {
        this.question = question;
    }

    @Override
    public String generateQuestion() {
        return null;
    }

    @Override
    public boolean checkAnswer(int answer) {
        return false;
    }
}
