package com.bieganski;

import java.util.Random;
import java.util.Scanner;

/**
 * Main concept of game "Guess the number"
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Guess the Number!");
        int randomNumber = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber < randomNumber)
                System.out.println("Your number is too low");
            else if (userNumber > randomNumber)
                System.out.println("Your number is too high");
            else {
                System.out.println("You are correct!");
                break;
            }
        } while (true);
    }
}
