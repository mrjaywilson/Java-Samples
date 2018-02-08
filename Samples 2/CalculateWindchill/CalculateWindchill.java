/*
 * Prompts the user to enter a temperature between -58F and 41F 
 * and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class CalculateWindchill {

	public static void main(String[] args) {
		
		// Declare and initialize variables and scanner object
		Scanner input = new Scanner(System.in);
		double temperature = -57d;
		double windSpeed = 2d;
		
		while (temperature == -57) {
			// Prompt user for input
			System.out.print("Enter a temperature between -58F and 41F: ");
			
			// Get user input and store in double
			temperature = verifyValue(input.nextLine(), -57);
		}
		
		while (windSpeed == 2) {
			// Prompt user for additional input
			System.out.printf("Enter the wind speed (greater than 2) in MPH: ");
			
			// Get user input and store in double
			windSpeed = verifyValue(input.nextLine(), 2);
		}
		
		// Calculate wind chill
		BigDecimal windChill = BigDecimal.valueOf(
				(35.74 + .6215 * temperature - 35.75 * Math.pow(windSpeed, .16)
				+ .4275 * temperature * Math.pow(windSpeed, .16)));
		
		// Output value to use to the nearest 5th decimal
		System.out.println("The Wind Chill index is: "
				+ windChill.setScale(5, BigDecimal.ROUND_HALF_UP));
		
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
