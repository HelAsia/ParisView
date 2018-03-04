package com.introtoandroid.parisview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context contex;
    Button przycisk;
    Button przycisk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk2 = (Button) findViewById(R.id.button2);
        przycisk2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ImageView flagImageView = (ImageView)findViewById(R.id.ImageView01);
                flagImageView.setImageResource(R.drawable.flag);
                Animation an = AnimationUtils.loadAnimation(contex,R.anim.spin);
                flagImageView.startAnimation(an);
            }
        });

        przycisk = (Button) findViewById(R.id.button);
        przycisk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contex = getApplicationContext();

                Intent intent = new Intent(contex, AnimationActivity.class);
                startActivity(intent);
            }
        });

        przycisk = (Button) findViewById(R.id.button_fragment);
        przycisk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contex = getApplicationContext();

                Intent intent = new Intent(contex, FragmentActivity.class);
                startActivity(intent);
            }
        });

        przycisk = (Button) findViewById(R.id.button_swipe);
        przycisk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contex = getApplicationContext();

                Intent intent = new Intent(contex, SwipeActivity.class);
                startActivity(intent);
            }
        });


    }
}
