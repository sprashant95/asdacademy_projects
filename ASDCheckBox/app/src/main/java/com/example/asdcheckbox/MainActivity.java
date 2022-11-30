package com.example.asdcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox android, swift, python, kotlin;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        swift = findViewById(R.id.swift);
        python = findViewById(R.id.python);
        kotlin = findViewById(R.id.kotlin);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Selected Course is: ";

                if (android.isChecked()){
                    result += "\nAndroid";
                }
                if (swift.isChecked()){
                    result += "\nSwift";
                }
                if (python.isChecked()){
                    result += "\nPython";
                }
                if (kotlin.isChecked()){
                    result += "\nKotlin";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}