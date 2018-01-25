package com.ramadan_apps.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ramadan_apps.mylibrary.CircleView;

public class MainActivity extends AppCompatActivity {
    CircleView circleView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleView = findViewById(R.id.circle);


    }
}
