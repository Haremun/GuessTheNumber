package com.bieganski;

public class Game {

    public void run() {
        UI Ui = new UI(System.in, System.out);
        Ui.show("Hello in Guess the number!");
        Range range = Ui.askUserForRange();
        RandomNumber randomNumber = range.getRandomNumber();
        if (randomNumber.getValue() < Ui.askUserForNumber().getValue())
            System.out.println("Too high");
    }
}
