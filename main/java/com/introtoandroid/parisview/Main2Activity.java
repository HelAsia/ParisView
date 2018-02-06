package com.introtoandroid.parisview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] items = {"Element 1", "Element 2", "Element 3"};
        ArrayAdapter adapt = new ArrayAdapter<>(this,R.layout.activity_main2, items);
    }
}
