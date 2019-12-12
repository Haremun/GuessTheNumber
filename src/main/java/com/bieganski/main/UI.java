package com.bieganski.main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    InputStream in;
    PrintStream out;

    public UI(InputStream in, PrintStream out) {
        this.in = in;
        this.out = out;
    }

    Range askUserForRange() {
        show("Minimal value: ");
        int min = getNumber();
        show("Max value: ");
        int max = getNumber();
        return new Range(min, max);
    }

    UserNumber askUserForNumber() {
        return new UserNumber(getNumber());
    }

    void show(String message) {
        System.out.println(message);
    }

    private int getNumber() {
        while (true) {
            try {
                Scanner scanner = new Scanner(in);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                show("It's not a number!");
            }
        }
    }
}
