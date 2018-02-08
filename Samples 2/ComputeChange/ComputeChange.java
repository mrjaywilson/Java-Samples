/*
 * Fixes the possible loss of accuracy when converting a double value to an int value. 
 * Enters the input as an integer whose last two digits represent the cents.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		int amount = -1;
		
		while (amount == -1) {
			// Prompt user for input
			System.out.print("Enter an amount as an integer with the last two numers as cents, for example 1156: ");
	
			// Get input from user
			amount = (int)verifyValue(input.nextLine(), -1);
		}
		
		int newAmount = amount;

		// Find the number of single bills
		int numberOfSingles = newAmount / 100;
		newAmount %= 100;

		// Find number of quarters
		int numberOfQuarters = newAmount / 25;
		newAmount %= 25;

		// Find number of dimes in the remaining amount
		int numberOfDimes = newAmount / 10;
		newAmount %= 10;

		// Find number of nickels
		int numberOfNickels = newAmount / 5;
		newAmount %= 5;

		// Find number of pennies
		int numberOfPennies = newAmount;

		// Output number to the user
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println("    " + numberOfSingles + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
		
		// Clean up
		input.close();
	}

	public static double verifyValue(String value, double min) {
		try {
			// Check user input for exit character 'q'
			// If not an exit character, check for validity
			if (value.toUpperCase().equals("Q")) {
				
				// Exit application
				System.exit(0);
			} else if (Double.parseDouble(value) == min || value == null) {
				
				// Inform user to either continue or exit application
				System.out.println("Incorrect value. Try again or type 'Q' to exit.");
			}
			
			// If checks pass, convert input to double and store
			return Double.parseDouble(value);
		} catch (Exception e) {
			// Let user know if there is an issue with the input
			System.out.println("Incorrect value. Try again or type 'Q' to exit.");
		}
		
		// Return 0 if anything fails through
		return min;
	}
}
