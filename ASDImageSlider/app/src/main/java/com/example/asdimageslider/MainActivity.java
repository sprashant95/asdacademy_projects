package com.example.asdimageslider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher imgSw;
    Button previousbtn, nextbtn;

    int[] images = {R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth};
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSw = findViewById(R.id.imgSw);
        previousbtn = findViewById(R.id.btnPrevious);
        nextbtn = findViewById(R.id.btnNext);

        imgSw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw = new ImageView(MainActivity.this);
                imgVw.setImageResource(images[position]);

                return imgVw;
            }
        });

       // imgSw.setInAnimation(this, android.R.anim.slide_in_left);
       // imgSw.setOutAnimation(this,android.R.anim.slide_out_right);

        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (position > 0){
                  position--;
               }
               else if(position<0)
                   position = 0;
               imgSw.setImageResource(images[position]);
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position< images.length)
                    position++;
                if (position>= images.length)
                    position = images.length-1;
                imgSw.setImageResource(images[position]);

            }
        });

    }
}