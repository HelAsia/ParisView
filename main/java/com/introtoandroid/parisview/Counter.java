package com.introtoandroid.parisview;

/**
 * Created by Asia on 2018-02-17.
 */

public class Counter {
    int results;

    public Counter (int numberOne, int numberTwo){
        this.results = numberOne + numberTwo;
    }

    public void setResults(int numberOne, int numberTwo){
        this.results = numberOne + numberTwo;
    }

    public int getResults() {
        return results;
    }
}
