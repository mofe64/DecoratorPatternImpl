package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionImplTest {
    Question question;

    @BeforeEach
    void setUp() {
        question = new QuestionImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateQuestion() {
        System.out.println(question.generateQuestion());
    }

    @Test
    void checkAnswer() {
    }
}