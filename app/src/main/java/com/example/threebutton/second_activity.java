package com.example.threebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        displayText = findViewById(R.id.display_text);
        Intent intent = getIntent();
        String display = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        displayText.setText(display);
    }
}