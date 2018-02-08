/*
 * Reads a number in feet, converts it to meters, and displays the result.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ConvertFeet {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variable
		Scanner input = new Scanner(System.in);
		double feet = 0d;
		
		while(feet == 0) {
			// Prompt user for input
			System.out.print("Enter a value for feet: ");
			
			// Get input and store in double variable
			feet = verifyValue(input.nextLine());
		}
		// Output values and string to user
		System.out.println(feet + " feet is " + (feet * .305) + " meters.");
		
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
