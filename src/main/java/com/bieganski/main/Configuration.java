package com.bieganski.main;

class Configuration {
    private Range range;
    private RandomNumber randomNumber;
    private Tries tries;
    private UI ui;

    Configuration(UI ui) {
        this.ui = ui;
    }

    void setUp(){
        range = ui.askUserForRange();
        randomNumber = range.getRandomNumber();
        tries = ui.askUserForTries();
        tries.calculate(range);
    }

    RandomNumber getRandomNumber() {
        return randomNumber;
    }

    Range getRange() {
        return range;
    }

    Tries getTries() {
        return tries;
    }
}
