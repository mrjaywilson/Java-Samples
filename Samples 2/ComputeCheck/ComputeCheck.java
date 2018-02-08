/*
 * Calculates a given gratuity into a given subtotal
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ComputeCheck {

	public static void main(String[] args) {

		// Initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double subtotal = 0d;
		double gratuity = 0d;
		
		// Prompt for user input
		System.out.print("Enter the subtotal: ");
		
		// Get input and store in a string
		subtotal = verifyValue(input.nextLine());
		
		// Prompt for additional input
		System.out.print("Enter gratuity percentage: ");
		
		// Get input and store in a string
		gratuity = verifyValue(input.nextLine());


		// Calculate values
		gratuity = subtotal * (gratuity / 100);
		double total = gratuity + subtotal;
		
		// Prints final output to user
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
		
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
