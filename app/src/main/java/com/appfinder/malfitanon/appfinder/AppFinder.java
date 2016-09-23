package com.appfinder.malfitanon.appfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppFinder extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_finder);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText("No, You Suck");
    }
}
