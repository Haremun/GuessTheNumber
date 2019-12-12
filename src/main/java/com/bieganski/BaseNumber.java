package com.bieganski;

import java.util.Objects;

class BaseNumber implements Comparable<BaseNumber> {
    private final int value;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseNumber that = (BaseNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
