package com.bieganski.main;

class GameLoop {
    private Configuration configuration;
    private UI Ui;

    GameLoop(Configuration configuration, UI Ui) {
        this.configuration = configuration;
        this.Ui = Ui;
    }

    void start() {
        for (int i = 0; i < configuration.getTries().getNumberOfTries(); i++){
            UserNumber userNumber = Ui.askUserForNumber();
            if (configuration.getRange().isInRange(userNumber)){
                Hint hint = Hint.of(userNumber.compareTo(configuration.getRandomNumber()));
                Ui.show(hint.toString());
                if (hint == Hint.CORRECT)
                    Ui.show("You win!");
                    break;
            } else {
                Ui.show("Number is not in range! Try again:");
            }
        }
    }

}
