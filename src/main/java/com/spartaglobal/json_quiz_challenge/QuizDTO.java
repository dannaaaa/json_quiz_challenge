package com.spartaglobal.json_quiz_challenge;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuizDTO {

    private JSONObject quiz;


    public QuizDTO(String filename){
        QuizJSONReader quizFileReader = new QuizJSONReader(filename);
        quiz = quizFileReader.getQuizJSONDetails();
        //maths = quizFileReader.getQuizJSONDetails();
    }

    public String getQuizMathsQ1() {
         JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject mathsObject = (JSONObject) quizObject.get("maths");
        JSONObject q1 = (JSONObject) mathsObject.get("q1");
        return (String) q1.get("question");

    }


    public String getQuizMathsQ2 () {

        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject mathsObject = (JSONObject) quizObject.get("maths");
        JSONObject q2 = (JSONObject) mathsObject.get("q2");
        return (String) q2.get("question");

    }

    public ArrayList getQuizSports(){
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("sport");
        JSONObject q1 = (JSONObject) sportObject.get("q1");
        return (ArrayList) q1.get("options");
    }

    public void printQuizMaths(){
        System.out.println(getQuizMathsQ1());
        System.out.println(getQuizMathsQ2());
    }

    public void printQuizSports(){
        System.out.println(getQuizSports());
    }

//    public JSONObject getQuizRoot(){
//        return qu;
//    }

    public Map<String , JSONObject> quizGenres(){
        Map<String, JSONObject> quizGenres = new HashMap<>();

        for (Object keyName:quiz.keySet()) {
            quizGenres.put((String) keyName, (JSONObject) quiz.get(keyName));
        }

        return quizGenres;
    }

    public String getQuesions(){


        return null;
    }















}

