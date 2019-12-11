package com.bieganski;

import java.util.Random;

class Range {

    private int minValue;
    private int maxValue;

    Range(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    boolean isInRange(UserNumber userNumber){
        return userNumber.getValue() >= minValue && userNumber.getValue() <= maxValue;
    }

    RandomNumber getRandomNumber() {
        Random random = new Random();
        return new RandomNumber((maxValue - minValue + 1) + minValue);
    }
}
