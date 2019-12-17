package com.example.numberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numButtonPress(View view) {
        TextView textView = findViewById(R.id.numberView);

        EditText numberEditText = findViewById(R.id.number);

        int numOne = Integer.parseInt(numberEditText.getText().toString(),2);

        textView.setText(Integer.toString(numOne));

    }
}