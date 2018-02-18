package com.introtoandroid.parisview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView cheeseList = new ListView(this);
        setContentView(cheeseList);

        final String[] items = {"Element 1", "Element 2", "Element 3"};
        ArrayAdapter<String> cheeseAdapter  = new ArrayAdapter<String>(this,R.layout.activity_main2,R.id.cheese_name, items);

        cheeseList.setAdapter(cheeseAdapter);

        cheeseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String message = "You clicked on " + items[i];

                Snackbar.make(adapterView,message, Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
