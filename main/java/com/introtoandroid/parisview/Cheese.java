package com.introtoandroid.parisview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class Cheese extends AppCompatActivity {
    String name;
    String description;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Cheese[] cheeses = {
            new Cheese("Parmesan", "Hard, granular cheese"),
            new Cheese("Ricotta", "Italian whey cheese"),
            new Cheese("Fontina", "Italian cow's milk cheese"),
            new Cheese("Mozzarella", "Southern Italian buffalo milk cheese"),
            new Cheese("Cheddar", "Firm, cow's milk cheese"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese);

        ArrayAdapter<Cheese> cheeseAdapter =
            new ArrayAdapter<Cheese>(this, 0, cheeses) {
                @Override
                public View getView(int position,
                                    View convertView,
                                    ViewGroup parent) {
                    Cheese currentCheese = cheeses[position];
                    if(convertView == null) {
                        convertView = getLayoutInflater()
                                .inflate(R.layout.activity_cheese, null, false);
                    }
                    TextView cheeseName =
                            (TextView)convertView.findViewById(R.id.cheese_name);
                    TextView cheeseDescription =
                            (TextView)convertView.findViewById(R.id.cheese_description);

                    cheeseName.setText(currentCheese.name);
                    cheeseDescription.setText(currentCheese.description);
                    return convertView;
                }
            };
    }
}
