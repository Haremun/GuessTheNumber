package com.bieganski;

class Tries {
    private final int numberOfTries;

    Tries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    int calculateUserTries(Range range) {
        int defaultTries = (range.getLength() * 5) / 100;
        if (defaultTries == 0) {
            defaultTries = 1;
        }
        return Math.min(numberOfTries, defaultTries);
    }
}
