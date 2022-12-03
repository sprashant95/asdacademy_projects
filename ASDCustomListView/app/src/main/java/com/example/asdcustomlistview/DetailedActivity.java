package com.example.asdcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    TextView dname, dprice;
    ImageView dimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dname = findViewById(R.id.dname);
        dprice = findViewById(R.id.dprice);
        dimage = findViewById(R.id.dimage);

        Intent intent = getIntent();
        String name = intent.getStringExtra("pname");
        String price = intent.getStringExtra("pprice");
        int image = intent.getIntExtra("pimage",R.drawable.apache);

        dname.setText(name);
        dprice.setText(price);
        dimage.setImageResource(image);

    }
}