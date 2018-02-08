/*
 * Obtains average acceleration based on time and velocity.
 * 
 * @author Jay Wilson
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class AverageAcceleration {

	public static void main(String[] args) {
		
		// Declare and initialize variables and scanner object
		Scanner input = new Scanner(System.in);
		double v0 = -999d,		// Velocity
				v1 = -999d,	// Velocity
				t = -999d;		// Time

		while (v0 == -999) {
			// Prompt user for input
			System.out.print("Enter v0: ");
			
			v0 = verifyValue(input.nextLine());
		}
		
		while (v1 == -999) {
			// Prompt user for input
			System.out.print("Enter v1: ");
			
			v1 = verifyValue(input.nextLine());
		}

		while (t == -999) {
			// Prompt user for input
			System.out.print("Enter t: ");
			
			t = verifyValue(input.nextLine());
		}
		
		// Compute the average velocity and store in BigDecimal to 
		// ensure float value remains relatively accurate after formula
		BigDecimal avg = BigDecimal.valueOf((v1 - v0) / t);
		
		// Output values to user with the help of BigDecimal to get accurate round
		System.out.println("The average acceleration is " + avg.setScale(4, BigDecimal.ROUND_UP));
		
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
		return -999d;
	}
}
