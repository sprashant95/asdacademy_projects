package com.example.asdradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton android, angularjs, swift;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        angularjs = findViewById(R.id.angularjs);
        swift = findViewById(R.id.swift);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = "Selected Programming Language is:";

                if (android.isChecked()){
                    result += "\nAndroid";
                }
                if (angularjs.isChecked()){
                    result += "\nAngularJS";
                }
                if (swift.isChecked()){
                    result += "\nSwift";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });


    }
}