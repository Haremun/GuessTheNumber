package com.bieganski;

class Game implements Runnable {
    @Override
    public void run() {
        UI ui = new UI(System.out, System.in);
        ui.show("Guess the number!");
        Range range = ui.askUserForRange();
        Tries tries = ui.askUserForTries();
        int rounds = tries.calculateUserTries(range.getLength());
        RandomNumber randomNumber = range.getRandomNumber();
        UserNumber userNumber = null;

        while (rounds > 0) {
            ui.show("Number: ");
            userNumber = ui.askUserForNumber();
            if (range.isInRange(userNumber)) {
                Hint hint = Hint.get(userNumber.compareTo(randomNumber));
                ui.show(hint.toString());
                if (userNumber.compareTo(randomNumber) == 0) {
                    break;
                }
            } else {
                ui.show("Number is not in range. Try again.");
            }
            rounds--;
        }
    }
}
