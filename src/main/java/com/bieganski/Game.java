package com.bieganski;

class Game {

    void run() {
        UI Ui = new UI(System.in, System.out);
        Ui.show("Hello in Guess the number!");
        Range range = Ui.askUserForRange();
        RandomNumber randomNumber = range.getRandomNumber();
        Hint hint = null;
        do {
            UserNumber userNumber = Ui.askUserForNumber();
            hint = Hint.of(userNumber.compareTo(randomNumber));
            Ui.show(hint.toString());
        } while (hint != Hint.CORRECT);
    }
}
