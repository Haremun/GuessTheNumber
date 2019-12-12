package com.bieganski.main;

class Tries {
    private int numberOfTries;

    Tries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    void calculate(Range range){
        numberOfTries = TriesCalculator.getNumberOfTriesForIntegers(numberOfTries, range);
    }

    int getNumberOfTries() {
        return numberOfTries;
    }

    @Override
    public String toString() {
        return "numberOfTries=" + numberOfTries;
    }
}
