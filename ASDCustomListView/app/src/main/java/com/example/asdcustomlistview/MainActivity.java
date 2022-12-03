package com.example.asdcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] pname = {"Apache", "Apple", "Atom", "CakePhp", "CouchDB", "Django", "GitHub", "Gradle","Intellij","Sketch",
            "Swift","Visual Studio"};

    String[] pprice = {"Local Server","Software Company","Programming Language","PHP Framework",
    "NoSQL DB","NoSQL DB","Cloud-based","Android Studio","Software Company","Design Tool","iPhone App","Coding Platform"};

    Integer[] pimage = {R.drawable.apache, R.drawable.apple, R.drawable.atom, R.drawable.cakephp, R.drawable.couchdb,
    R.drawable.django, R.drawable.github, R.drawable.gradle, R.drawable.intellij, R.drawable.sketch,
    R.drawable.swift, R.drawable.visualstudio};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        MyListAdapter myListAdapter = new MyListAdapter(this,pname,pprice,pimage);
        list.setAdapter(myListAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);
                intent.putExtra("pname",pname[i]);
                intent.putExtra("pprice",pprice[i]);
                intent.putExtra("pimage",pimage[i]);
                startActivity(intent);

            }
        });
    }
}