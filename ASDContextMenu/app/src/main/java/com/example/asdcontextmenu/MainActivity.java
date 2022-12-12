package com.example.asdcontextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context menu");
        menu.add(0,v.getId(),0,"View");
        menu.add(0,v.getId(),0,"Edit");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"Select");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        Toast.makeText(getApplicationContext(),"Selected item is: "+item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}