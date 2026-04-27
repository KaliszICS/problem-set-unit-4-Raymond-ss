/** NOT FINISH - Opt3
        * File: Unit 4 - Problem set
        * Author: Raymond
        * Date Created: April 20, 2026
        * Date Last Modified: April 27, 2026

*/
/* 
import java.util.Scanner;
import java.util.Random; 

public class Probleme {

	public static void main(String args[]) {
	
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the High low guessing game");

		//checks for number of rounds 
		System.out.println("Input number of rounds");
		int numRound = input.nextInt();
		while (!(numRound > 0)) {
			System.out.println("Invaild Input\nInput number of rounds:");
			numRound = input.nextInt();
		} 
		
		//range checker
	
		Boolean vaild = false;
		//declearing 
		int numfinalRangeBeginning = 0;
		int numfinalRangeEnding = 0;
		while (vaild == false) {
			String numRange = "";
			// range input
			System.out.println("Input a range");
			numRange = input.nextLine();

			//# of dashes
			int numTotalDash = 0;
			int i = 0; 
			while (i < numRange.length()){
				if (numRange.charAt(i) == '-') {
					numTotalDash++;
				}
			i++;
			}

			String numRangeBeginning = "";
			String numRangeEnding = "";
			int dash = 0;
			//checks for more han 3 locaion of hte dash
			if (numTotalDash > 3) {
				System.out.println("Input a range");
				vaild = false;
			}
			//checks if there is mroe han 2 locaion of dash
			else if (numTotalDash == 3) {
				int dashMiddle1 = (numRange.indexOf("-"));
				int dashMiddle2 = (numRange.lastIndexOf("-"));
				String dashMiddle = numRange.substring(dashMiddle1, dashMiddle2);
				dash = dashMiddle.indexOf("-");
			}
			//if less than 1 locaion of dash,
			else{
				dash = numRange.lastIndexOf("-");
				numRangeBeginning = numRange.substring(0,dash);
				numRangeEnding = numRange.substring(dash);
			}
			//numbers for ranges - fractions
			if () {

			}
			String numRangeBeginning1 = numRange.substring(0,dash);
			String numRangeEnding1 = numRange.substring(dash);
			numfinalRangeBeginning = Integer.parseInt(numRangeBeginning1);
			numfinalRangeEnding = Integer.parseInt(numRangeEnding1);

			//checking if numbers are vaild 
		
		}
			
		// main game 
		int score = 0;
		int startRound = 1;
		while (numRound >= startRound){
			// round number
			System.out.println("Round "+startRound);

			System.out.println("Please select High, Low or Even:\n" + 
			"1. High "+ numfinalRangeBeginning + " to " +numfinalRangeEnding+")\n  +  
			 2. Low" + numfinalRangeBeginning+ "to"+ numfinalRangeEnding)"\n + + "
			 3. Even();

			System.out.println("");
			int numRound2 = input.nextInt();
			while (!(numRound2 == 1 || numRound2 == 2 || numRound2 == 3)) {
				System.out.println("Invaild Input\n");
				numRound2 = input.nextInt();
			} 
			//checking value
			System.out.println(numfinalRangeBeginning);
			System.out.println(numfinalRangeEnding);

			int ramdomNumber = rand.nextInt(numfinalRangeBeginning, numfinalRangeEnding);

			if (ramdomNumber >= 11 && ramdomNumber <= 20 && numRound2 == 1) {
				System.out.println("correc high");
				score++;
			}
			else if (ramdomNumber == 10 && numRound2 == 3) {
				System.out.println("correct Even");
				score++;
			}
			else if (ramdomNumber >= 0 && ramdomNumber <= 9 && numRound2 == 2) {
				System.out.println("correct low");
				score++;
			}
			else {
				System.out.println("incorrect");
			}
			startRound++;
		}

		System.out.println("rounds: " + numRound);
		if (score > numRound / 2) {
			System.out.println("winner");
		}
		else {
			System.out.println("loser");
		}

	}

}
	*/
