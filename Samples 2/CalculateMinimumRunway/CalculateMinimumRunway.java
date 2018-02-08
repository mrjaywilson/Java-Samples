/*
 * Prompts the user to enter v in meters/second (m/s) and the 
 * acceleration 'a' in meters/second squared (m/s2), and displays the minimum runway 
 * length needed for takeoff.
 * 
 * @author Jay Wilson
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateMinimumRunway {

	public static void main(String[] args) {
		
		// Declare and initialize Scanner object
		Scanner input = new Scanner(System.in);
		double velocity = -999d;
		double acceleration = -999d;
		
		while (velocity == -999) {
			// Prompt user for input
			System.out.print("Enter velocity: ");
			velocity = verifyValue(input.nextLine());
		}
		
		while (acceleration == -999) {
			// Prompt user for input
			System.out.print("Enter acceleration: ");
			acceleration = verifyValue(input.nextLine());
		}
		
		// Calculate the runway length and place the value into BigDecimal type for rounding
		BigDecimal minRunwayLength = BigDecimal.valueOf((Math.pow(velocity,  2)) / (2 * acceleration));
		
		// Output the values to the user, use setScale to round the value to three places
		System.out.println("The minimum runway length for this airplane is "
				+ minRunwayLength.setScale(3, BigDecimal.ROUND_HALF_UP));
		
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
		return -999d;
	}
}
