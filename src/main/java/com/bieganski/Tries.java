package com.bieganski;

class Tries {
    private final int numberOfTries;

    Tries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    int calculateUserTries(int rangeLength) {
        int defaultTries = (rangeLength * 5) / 100;
        if (defaultTries == 0) {
            defaultTries = 1;
        }
        return Math.min(numberOfTries, defaultTries);
    }
}
