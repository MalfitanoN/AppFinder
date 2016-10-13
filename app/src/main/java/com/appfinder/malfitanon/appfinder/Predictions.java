package com.appfinder.malfitanon.appfinder;

import java.util.Random;

/**
 * Created by Student on 9/22/2016.
 * floatmath error fix delete float
 */
public class Predictions {

    private static Predictions predictions;

    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "Clash Royale",
                "Hill Climb",
                "Crash Drive 2",
                "Clash of Clans",
                "Minecraft",
                "Heads up",
                "Bloon TD 5",
                "NBA 2K 17",
                "Geometry Dash"
        };
    }

    public static Predictions get(){
        if(predictions == null){
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction(){
        rnd = random.nextInt(answers.length);
        return answers[rnd];
    }
}
