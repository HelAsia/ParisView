package com.introtoandroid.parisview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        final Button now = (Button) findViewById(R.id.do_flagi);
        final ImageView iv = (ImageView)findViewById(R.id.flag_anim2);
        now.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                iv.setBackgroundResource(R.drawable.juggle);

                AnimationDrawable frameAnimation = (AnimationDrawable) iv.getBackground();
                frameAnimation.start();

            }
        });

    }
}
