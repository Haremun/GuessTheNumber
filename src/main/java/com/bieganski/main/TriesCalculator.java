package com.bieganski.main;

class TriesCalculator {
    static int getNumberOfTriesForIntegers(int tries, Range range) {
        int defaultNumberOfTires = (range.getLength() * 5) / 100;
        if (defaultNumberOfTires < 1)
            return 1;
        return Math.min(tries, defaultNumberOfTires);
    }

    static int getNumberOfTriesForNonIntegers() {
        return 10;
    }
}
