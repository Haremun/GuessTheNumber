package com.bieganski.main;

import java.util.Random;

class Range {

    private int minValue;
    private int maxValue;

    Range(int minValue, int maxValue) {
        this.minValue = Math.min(minValue, maxValue);
        this.maxValue = Math.max(minValue, maxValue);
    }

    boolean isInRange(UserNumber userNumber) {
        return userNumber.getValue() >= minValue && userNumber.getValue() <= maxValue;
    }

    int getLength() {
        return Math.abs(maxValue - minValue);
    }

    RandomNumber getRandomNumber() {
        Random random = new Random();
        return new RandomNumber(random.nextInt(maxValue - minValue + 1) + minValue);
    }
}
