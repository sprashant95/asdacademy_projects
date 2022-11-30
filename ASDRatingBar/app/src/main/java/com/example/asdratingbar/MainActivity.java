package com.example.asdratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button getBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        getBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int noOfStars = ratingBar.getNumStars();
                float getrating = ratingBar.getRating();
                textView.setText("Rating is : "+getrating+"/"+noOfStars);
            }
        });


    }
}