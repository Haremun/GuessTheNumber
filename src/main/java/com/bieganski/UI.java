package com.bieganski;

import java.util.InputMismatchException;
import java.util.Scanner;

class UI {
    void show(String message){
        System.out.println(message);
    }
    UserNumber getUserInput() {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                return new UserNumber(scanner.nextInt());
            } catch (InputMismatchException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}
