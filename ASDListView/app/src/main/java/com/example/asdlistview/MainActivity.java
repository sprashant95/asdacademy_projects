package com.example.asdlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] languages = {"Android","Swift","Python","JAVA","AngularJS","NodeJS","Pearl","Ruby",
            "Android","Swift","Python","JAVA","AngularJS","NodeJS","Pearl","Ruby",
            "Android","Swift","Python","JAVA","AngularJS","NodeJS","Pearl","Ruby"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,languages);
        listView.setAdapter(arrayAdapter);

    }
}