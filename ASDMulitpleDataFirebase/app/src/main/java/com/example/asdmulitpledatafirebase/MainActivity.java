package com.example.asdmulitpledatafirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3, t4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.rollno);
        t2 = findViewById(R.id.name);
        t3 = findViewById(R.id.course);
        t4 = findViewById(R.id.duration);

        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rollno = t1.getText().toString();
                String name = t2.getText().toString();
                String course = t3.getText().toString();
                String duration = t4.getText().toString();

                MyDBHolder obj = new MyDBHolder(name,course,duration);

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("students");

                node.child(rollno).setValue(obj);

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

                Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();

            }
        });
    }
}