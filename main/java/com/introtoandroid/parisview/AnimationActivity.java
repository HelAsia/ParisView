package com.introtoandroid.parisview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimationActivity extends AppCompatActivity {
    Button przycisk;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        final Button now = (Button) findViewById(R.id.do_flagi);

        now.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ImageView iv = (ImageView)findViewById(R.id.flag_anim2);
                iv.setBackgroundResource(R.drawable.juggle);

                AnimationDrawable frameAnimation = (AnimationDrawable) iv.getBackground();
                frameAnimation.start();

            }
        });

        przycisk = (Button) findViewById(R.id.button_activity_3);
        przycisk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                context = getApplicationContext();

                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        });

        przycisk = (Button) findViewById(R.id.cheese);
        przycisk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                context = getApplicationContext();

                Intent intent = new Intent(context, ExampleActivity.class);
                startActivity(intent);
            }
        });

        przycisk = (Button) findViewById(R.id.resultActionButton);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = getApplicationContext();
                Intent newScreen = new Intent (context, ResultsActivity.class);

                TextView numberOneText = (TextView) findViewById(R.id.numberOneEditText);
                String numberOneString = numberOneText.getText().toString();

                TextView numberTwoText = (TextView) findViewById(R.id.numberTwoEditText);
                String numberTwoString = numberTwoText.getText().toString();

                newScreen.putExtra("one",numberOneString);
                newScreen.putExtra("two",numberTwoString);

                startActivity(newScreen);
            }
        });


    }
}
