package com.bieganski;

import java.util.Random;

class Range {
    private final int minValue;
    private final int maxValue;

    Range(int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    RandomNumber getRandomNumber() {
        Random random = new Random();
        return new RandomNumber(random.nextInt(maxValue) + 1);
    }

    public boolean isInRange(UserNumber userNumber) {
        return userNumber.getValue() <= maxValue && userNumber.getValue() >= minValue;
    }
}
