/*
 * Converts pounds into kilograms.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ConvertGrams {

	public static void main(String[] args) {
		
		// Declare and initialize Scanner object and variable
		Scanner input = new Scanner(System.in);
		double pounds = 0d;
		
		// Loop until proper value entered or user quits
		while (pounds == 0) {
			// Prompt user for input
			System.out.print("Enter a number in pounds: ");
			
			// Get input and store in double variable
			pounds = verifyValue(input.nextLine());
		}
		
		// Output values to user
		System.out.println(pounds + " is " + (pounds * .454) + " kilograms.");
		
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
