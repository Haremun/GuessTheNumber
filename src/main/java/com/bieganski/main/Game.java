package com.bieganski.main;

public class Game {

    public void run() {
        UI Ui = new UI(System.in, System.out);
        Ui.show("Hello in Guess the number!");
        Range range = Ui.askUserForRange();
        RandomNumber randomNumber = range.getRandomNumber();
        Hint hint = null;
        Ui.show("Enter the number:");
        do {
            UserNumber userNumber = Ui.askUserForNumber();
            if (range.isInRange(userNumber)){
                hint = Hint.of(userNumber.compareTo(randomNumber));
                Ui.show(hint.toString());
            } else {
                Ui.show("Number is not in range! Try again:");
            }
        } while (hint != Hint.CORRECT);
    }
}
