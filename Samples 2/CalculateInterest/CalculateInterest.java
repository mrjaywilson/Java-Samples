/*
 * Reads the balance and the annual percentage interest rate and 
 * displays the interest for the next month.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double balance = 0d;
		double interestRate = 0d;
		
		while (balance == 0) {
			// Prompt user for input
			System.out.print("Enter balance greater than 0: ");
			
			// Get input
			balance = verifyValue(input.nextLine(), 0);
		}

		while (interestRate == 0) {
			// Prompt user for input
			System.out.print("Enter interest rate (e.g. 3 for 3%%): ");
			
			// Get input
			interestRate = verifyValue(input.nextLine(), 0);
		}

		// Calculate interest
		double interest = balance * (interestRate / 1200);
		
		// Output to console
		System.out.println("The interest is " + interest);
		
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
