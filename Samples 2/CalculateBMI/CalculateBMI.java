/*
 * Prompts the user to enter a weight in pounds and 
 * height in inches and displays the BMI.
 * 
 * @author Jay Wilson
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {

		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double weight = 0d;
		double height = 0d;
		
		while (weight == 0) {
			// Prompt user for input
			System.out.print("Enter weight in pounds: ");
			
			// Get input, multiply by 0.45359237 to get weight in kilograms, and store
			// in double variable
			weight = 0.45359237 * verifyValue(input.nextLine());
		}

		while (height == 0) {
			// Prompt user for additional input
			System.out.printf("Enter height in inches: ");
			
			// Get input, multiply by 0.0254 to get height in meters, and store
			// in double variable		
			height = 0.0254 * verifyValue(input.nextLine());
		}
		
		// Calculate BMI and store in BigDecimal
		BigDecimal BMI = BigDecimal.valueOf(weight / Math.pow(height, 2));
		
		// Output value to user, and round number to 4th place.
		System.out.println("BMI is " + BMI.setScale(4, BigDecimal.ROUND_HALF_UP));
		
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
