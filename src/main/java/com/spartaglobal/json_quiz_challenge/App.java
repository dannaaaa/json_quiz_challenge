package com.spartaglobal.json_quiz_challenge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        QuizDTO quizDTO = new QuizDTO("resources/quiz.json");
        //System.out.println(quizDTO.getQuiz());
       // System.out.println(quizDTO.getQuizMaths());
        //System.out.println(quizDTO.getQuizSports());
       // quizDTO.printQuizMaths();
       // quizDTO.printQuizSports();
        System.out.println(quizDTO.quizGenres());
    }
}
