package com.bieganski;

import java.util.Random;

class Range {
    private final int minValue;
    private final int maxValue;

    Range(int minValue, int maxValue) {
        if (minValue > maxValue) {
            this.maxValue = minValue;
            this.minValue = maxValue;
        } else {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
    }

    RandomNumber getRandomNumber() {
        Random random = new Random();
        return new RandomNumber(random.nextInt(maxValue - minValue + 1) + minValue);
    }

    boolean isInRange(BaseNumber userNumber) {
        return userNumber.getValue() <= maxValue && userNumber.getValue() >= minValue;
    }

    int getLength() {
        return Math.abs(maxValue - minValue) + 1;
    }

    @Override
    public String toString() {
        return "minValue=" + minValue +
                ", maxValue=" + maxValue;
    }
}
