package com.bieganski;

public class Game implements Runnable {
    @Override
    public void run() {
        UI Ui = new UI(System.out, System.in);
        Ui.show("Guess the number!");
        Range range = Ui.askUserForRange();
        RandomNumber randomNumber = range.getRandomNumber();
        UserNumber userNumber = null;
        Hint hint = null;
        do {
            Ui.show("Number: ");
            userNumber = Ui.askUserForNumber();
            if (range.isInRange(userNumber)) {
                hint = Hint.get(userNumber.compareTo(randomNumber));
                Ui.show(hint.toString());
            } else
                Ui.show("Number is not in range. Try again:");

        } while (hint != Hint.CORRECT);

    }
}
