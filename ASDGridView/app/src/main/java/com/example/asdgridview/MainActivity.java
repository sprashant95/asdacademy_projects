package com.example.asdgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] pname = {"GUCCI","ADIDAS","PRADA","TOMMY HILFIGER","LEVIS","BENETTON","CALVIN KLIEN","CHANEL"};

    Integer[] pimage = {R.drawable.gucci,R.drawable.adidas,R.drawable.prada,R.drawable.tommy,
    R.drawable.levis,R.drawable.benetton,R.drawable.calvin,R.drawable.chanel};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        MyGridAdapter myGridAdapter = new MyGridAdapter(this,pname,pimage);
        gridView.setAdapter(myGridAdapter);

    }
}