/** Opt 2
        * File: Unit 4 - Problem set
        * Author: Raymond
        * Date Created: April 20, 2026
        * Date Last Modified: April 27, 2026

*/

import java.util.Scanner;
import java.util.Random; 

public class ProblemSet {

	public static void main(String args[]) {
		//welcome message
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the High low guessing game");

		//checks for number of rounds 
		System.out.println("Input number of rounds");
		int numRound = input.nextInt();
		while (!(numRound > 0)) {
			System.out.println("Invaild Input\nInput number of rounds:");
			numRound = input.nextInt();
		} 
		
		/*//range checker
		int numRange = input.nextInt();
		while (numRange > 0) {
			System.out.println("Invaild Input");
			numRange = input.nextInt();
		}
			*/
		// main game 
		int score = 0;
		int startRound = 1;
		while (numRound >= startRound){
			//round number
			System.out.println("Round "+startRound);

			System.out.println("Please select High, Low or Even:\r\n" + //
								"\t1. High (11 to 20)\r\n" + //
								"\t2. Low (0 to 9)\r\n" + //
								"\t3. Even(10)");

			//checking if guess it valid	
			System.out.println("");
			int numRound2 = input.nextInt();
			while (!(numRound2 == 1 || numRound2 == 2 || numRound2 == 3)) {
				System.out.println("Invaild Input\n Please select High, Low or Even");
				numRound2 = input.nextInt();
			} 

			//generate number
			int ramdomNumber = random.nextInt(20);

			//checking value
			//high
			if (ramdomNumber >= 11 && ramdomNumber <= 20 && numRound2 == 1) {
				score++;
				System.out.println("The number was " + ramdomNumber + " you are correct" + "\nYour Score: " + score);
		
			}
			//even
			else if (ramdomNumber == 10 && numRound2 == 3) {
				score++;
				System.out.println("The number was " + ramdomNumber + " you are correct" + "\nYour Score: " + score);
				
			}
			//odd
			else if (ramdomNumber >= 0 && ramdomNumber <= 9 && numRound2 == 2) {
				score++;
				System.out.println("The number was " + ramdomNumber + " your are correct" + "\nYour Score: " + score);
				
			}
			//guess was incorrect
			else {
				System.out.println("The number was " + ramdomNumber + " you are incorrect"+ "\nYour Score: " + score);
			}
			startRound++;

		}
		//ending
		//checking there final score is more than 50%
		if (score > numRound / 2) { 
			System.out.println("Winner. "+ "Congratulations you got " + score + " out of "+ numRound + " rounds right!");
		}
		else {
			System.out.println("You got " + score +" out of " + numRound + " correct." + " Better Luck next time");
		}

	}

}
