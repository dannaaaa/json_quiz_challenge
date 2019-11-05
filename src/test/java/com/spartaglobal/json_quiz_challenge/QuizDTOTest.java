package com.spartaglobal.json_quiz_challenge;

import org.junit.Assert;
import org.junit.Test;

public class QuizDTOTest {

    private QuizDTO quizDTO = new QuizDTO("resources/quiz.json");


    @Test
    public void getQuizMathsQ1Test(){
        Assert.assertEquals( "6 + 7 = ?", quizDTO.getQuizMathsQ1());
    }

    @Test
    public void getQuizMathsQ2Test (){
        Assert.assertEquals("12 - 8 = ?", quizDTO.getQuizMathsQ2());
    }




}
