/*
 * Prompts the user to enter the side of a hexagon and 
 * displays its area.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class HexagonArea {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double sideLength = 0d;
		
		while (sideLength == 0) {
			// Prompt user for input
			System.out.print("Enter the side length: ");
			
			// Get user input and place in double variable
			sideLength = verifyValue(input.nextLine());
		}
		
		// Calculate are of the hexagon
		BigDecimal area = BigDecimal.valueOf(((3 * Math.pow(3, .5)) / 
				2) * Math.pow(sideLength, 2));
		
		// Output value to user to the 4th decimal place
		System.out.println("The area of the hexagon is "
				+ area.setScale(4, BigDecimal.ROUND_HALF_UP));
		
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
