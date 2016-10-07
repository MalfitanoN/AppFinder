package com.appfinder.malfitanon.appfinder;

/**
 * Created by Student on 9/22/2016.
 * floatmath error fix delete float
 */
public class Predictions {

    private static Predictions predictions;

    private String[] answers;
    
    private Predictions() {
        answers = new String[] {
              "No, RIPSOOOCE",
                "Not Today"
        };
    }

    public static Predictions get(){
        if(predictions == null){
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction(){
        return answers[0];
    }
}
