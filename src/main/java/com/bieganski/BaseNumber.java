package com.bieganski;

class BaseNumber implements Comparable<BaseNumber> {
    private int value;

    BaseNumber(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public int compareTo(BaseNumber o) {
        return Integer.compare(value, o.value);
    }
}
