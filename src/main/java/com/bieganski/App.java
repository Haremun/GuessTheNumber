package com.bieganski;

public class App {
    public static void main(String[] args) {
        UI Ui = new UI();
        Ui.show("Guess the number!");
        Range range = new Range(0, 100);
        RandomNumber randomNumber = range.getRandomNumber();
        UserNumber userNumber = null;
        Hint hint = null;
        do {
            userNumber = Ui.getUserInput();
            hint = Hint.get(userNumber.compareTo(randomNumber));
            System.out.println(hint.toString());
        } while (hint != Hint.CORRECT);

    }
}
