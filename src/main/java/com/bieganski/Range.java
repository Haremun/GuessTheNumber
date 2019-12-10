package com.bieganski;

import java.util.Random;

class Range {
    private int minValue;
    private int maxValue;

    Range(int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    RandomNumber getRandomNumber() {
        Random random = new Random();
        return new RandomNumber(random.nextInt(maxValue) + 1);
    }
}
