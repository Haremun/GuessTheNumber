import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.prefs.*;
import java.util.regex.*;
import java.util.stream.*;
public class Game{
	Game(){
		Random rand = new Random();
		System.out.println("How much tries?");
		int maxNumber = 100;
		int number = rand.nextInt(maxNumber)+1;
		Scanner scanner = new Scanner(System.in);
		int userTries = 0;
		try{
			userTries = scanner.nextInt();
		} catch (Exception ex)
		{
			System.out.println(ex);
		}
		int tries = userTries < (5 * maxNumber)/100 ? userTries : (5 * maxNumber)/100;
		int userAnswer = 0;
		System.out.println("Guess the number");
		for (int i = 0; i < tries; i++){
			try{
				userAnswer = scanner.nextInt();
			} catch (Exception ex){
				System.out.println(ex);
			}
			if (userAnswer < number)
				System.out.println("Too low!");
			else if (userAnswer > number)
				System.out.println("Too high!");
			else if (userAnswer == number){
				System.out.println("You are correct!");
				break;
			}
		}
	}
}
