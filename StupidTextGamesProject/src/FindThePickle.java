/**
 * 
 * @author Jared Reiling
 *
 */
import java.util.Scanner;
import java.util.Random;

public class FindThePickle implements StupidTextGame{
	
	
	public String getName() {
		return "Find the Pickle!";
	}
	
	public void play(Scanner console) {
		Random rand = new Random();
		
		int pickleNum = rand.nextInt(4) + 1;
		int numGuesses = 0;
		boolean win = false;
		
		System.out.println("Find the Pickle! The Pickle is Hidden in One of Four Boxes.");
		System.out.println("Type the box number between 1-4 to find the pickle.");
		System.out.println("You have 3 tries to find the pickle; else, you get pickled!");
		
		while (numGuesses < 3 && !win) {
			System.out.print("Guess " + numGuesses + ": ");
			int answer = console.nextInt();
			if (answer == pickleNum) {
				win = true;
			} else {
				System.out.println("Not there! Keep guessing!");
				System.out.println();
			}
			numGuesses++;
		}
		
		if (win) {
			System.out.println("Nice work, buddy! You got the pickle!");
		} else {
			System.out.println("Welp. Somebody just got pickled!");
		}
	}
}
