package com.introtoandroid.parisview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultTextView = (TextView) findViewById(R.id.resultTextView);

        Bundle bundle = getIntent().getExtras();

        String one = bundle.getString("one");
        String two = bundle.getString("two");

        Counter counter = new Counter(one,two);
   
        resultTextView = (TextView)findViewById(R.id.resultTextView);
        resultTextView.setText(counter.getResults());
    }
}
