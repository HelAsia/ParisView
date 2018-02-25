package com.introtoandroid.parisview;

/**
 * Created by Asia on 2018-02-17.
 */

public class Counter {
    String resultsString;
    int numberOneInt;
    int numberTwoInt;
    int resultsInt;


    public Counter (String numberOne, String numberTwo){

        this.numberOneInt = Integer.parseInt(numberOne);
        this.numberTwoInt = Integer.parseInt(numberTwo);

        this.resultsInt = this.numberOneInt + this.numberTwoInt;
        this.resultsString = Integer.toString(this.resultsInt);
    }

    public void setResults(String numberOne, String numberTwo){
        this.numberOneInt = Integer.parseInt(numberOne);
        this.numberTwoInt = Integer.parseInt(numberTwo);

        this.resultsInt = this.numberOneInt + this.numberTwoInt;
        this.resultsString = Integer.toString(this.resultsInt);
    }

    public String getResults() {

        return resultsString;
    }
}
