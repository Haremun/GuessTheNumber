package com.bieganski;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class UI {
    private PrintStream out;
    private InputStream in;

    UI(PrintStream out, InputStream in) {
        this.out = out;
        this.in = in;
    }

    void show(String message) {
        out.println(message);
    }

    UserNumber askUserForNumber() {
        return new UserNumber(getNumber());
    }

    Range askUserForRange() {
        show("Min value:");
        int minValue = getNumber();
        show("Max value:");
        int maxValue = getNumber();
        return new Range(minValue, maxValue);
    }

    private int getNumber() {
        while (true) {
            try {
                Scanner scanner = new Scanner(in);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
