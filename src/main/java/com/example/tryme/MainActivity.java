package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private View windowview;
    private Button trymebutton;
    private int[] colors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         colors = new int[]{Color.BLUE,Color.CYAN,Color.RED,Color.MAGENTA,Color.BLUE};

         windowview = findViewById(R.id.windowviewId);

         trymebutton = (Button) findViewById(R.id.buttonid);

         trymebutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 int Arraylength = colors.length;

                 Random random = new Random();

                 int Randomnum = random.nextInt(Arraylength);

                 windowview.setBackgroundColor(colors[Randomnum]);

                 Log.d("Random", String.valueOf(Randomnum));

             }
         });


    }
}