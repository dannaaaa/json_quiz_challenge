package com.spartaglobal.json_quiz_challenge;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizJSONReader {

    private JSONObject quizJSONDetails;

    public QuizJSONReader(String filename){

        try {
            FileReader quizJSON = new FileReader(filename);

            JSONParser jsonParser = new JSONParser();
            Object quizObject = jsonParser.parse(quizJSON);

            quizJSONDetails = (JSONObject) quizObject;

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }

    public JSONObject getQuizJSONDetails() {
        return quizJSONDetails;
    }


}
