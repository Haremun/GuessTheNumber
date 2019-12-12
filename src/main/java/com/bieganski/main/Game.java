package com.bieganski.main;

public class Game {

    public void run() {
        UI Ui = new UI(System.in, System.out);
        Ui.show("Hello in Guess the number!");
        Configuration configuration = new Configuration(Ui);
        configuration.setUp();
        Ui.show("Enter the number:");
        new GameLoop(configuration, Ui).start();
    }
}
