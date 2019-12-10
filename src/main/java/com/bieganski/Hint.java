package com.bieganski;

enum Hint {
    TOO_LOW, TOO_HIGH, CORRECT;

    public static Hint get(int compareTo) {
        switch (compareTo){
            case -1:
                return TOO_LOW;
            case 0:
                return CORRECT;
            case 1:
                return TOO_HIGH;
        }
        return TOO_LOW;
    }
}
