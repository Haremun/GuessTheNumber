package com.bieganski;

class Game implements Runnable {
    @Override
    public void run() {
        UI ui = new UI(System.out, System.in);
        ui.show("Guess the number!");
        Range range = ui.askUserForRange();
        RandomNumber randomNumber = range.getRandomNumber();
        UserNumber userNumber = null;
        Hint hint = null;
        do {
            ui.show("Number: ");
            userNumber = ui.askUserForNumber();
            if (range.isInRange(userNumber)) {
                hint = Hint.get(userNumber.compareTo(randomNumber));
                ui.show(hint.toString());
            } else
                ui.show("Number is not in range. Try again:");

        } while (hint != Hint.CORRECT);
    }
}
