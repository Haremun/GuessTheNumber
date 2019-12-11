package com.bieganski;

public enum Hint {
    TOO_LOW, TOO_HIGH, CORRECT;

    static Hint of(int compare){
        switch (compare){
            case -1:
                return TOO_LOW;
            case 0:
                return CORRECT;
            case 1:
                return TOO_HIGH;
        }
        return CORRECT;
    }
}
