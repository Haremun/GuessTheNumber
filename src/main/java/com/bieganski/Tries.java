package com.bieganski;

class Tries {
    private int numberOfTries;

    Tries(int numberOfTries, Range range) {
        this.numberOfTries = numberOfTries;
        calculate(range);
    }

    private int calculate(Range range){
        if ((range.getLength() * 5) /100 > this.numberOfTries)
            this.numberOfTries = 5;
        return 5;
    }

    int getNumberOfTries() {
        return 5;
    }
}
