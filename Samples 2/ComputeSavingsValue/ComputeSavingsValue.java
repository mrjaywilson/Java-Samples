/*
 * Prompts the user to enter a monthly saving amount and displays the account value
 * after the sixth month.
 * 
 * @author Jay Wilson
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class ComputeSavingsValue {

	public static void main(String[] args) {

		// Declare and initialize Scanner Object and variables
		Scanner input = new Scanner(System.in);
		double monthlyDeposit = 0d;
		
		while(monthlyDeposit == 0) {
			// Prompt user for input
			System.out.print("Enter the monthly saving amount: ");
			
			// Get the monthly deposit from user
			monthlyDeposit = verifyValue(input.nextLine());
		}
		
		BigDecimal balance = new BigDecimal(0.0);
		
		for (int i = 1; i < 7; i++) {
			balance = BigDecimal.valueOf((monthlyDeposit + balance.doubleValue()) * (1 + .00417));
		}		
		System.out.println("After six months, the account value should be $" + balance.setScale(2, BigDecimal.ROUND_HALF_UP));
		
		// Clean up
		input.close();
	}

	public static double verifyValue(String value) {
		try {
			// Check user input for exit character 'q'
			// If not an exit character, check for validity
			if (value.toUpperCase().equals("Q")) {
				
				// Exit application
				System.exit(0);
			} else if (Double.parseDouble(value) == 0 || value == null) {
				
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
		return 0d;
	}
}
