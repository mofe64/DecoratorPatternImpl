package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelThreeDecoratorTest {
    Question question;
    Question levelThreeQuestion;

    @BeforeEach
    void setUp() {
        question = new QuestionImpl();
        levelThreeQuestion = new LevelThreeDecorator(question);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatLevelNumberShouldBeSetToThreeWhenLevelThreeQuestionInitialized() {
        assertEquals(3, levelThreeQuestion.getLevelNumber());
    }

    @Test
    void testThatLevelLimitShouldBeSetToTenWhenLevelThreeQuestionInitialized() {
        assertEquals(10, levelThreeQuestion.getLevelLimit());
    }

    @Test
    void generateQuestion() {
        levelThreeQuestion.generateQuestion();
        assertNotNull(levelThreeQuestion.getQuestionString());

    }

    @Test
    void determineAnswer() {
        levelThreeQuestion.generateQuestion();
        System.out.println(levelThreeQuestion.getAnswer().toString());
        assertNotNull(levelThreeQuestion.getAnswer());
    }
}