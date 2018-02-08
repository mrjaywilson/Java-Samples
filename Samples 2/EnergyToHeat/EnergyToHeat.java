/*
 * Calculates the amount of energy needed to heat water from an initial
 * temperature to a final temperature.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class EnergyToHeat {

	public static void main(String[] args) {
		
		// Declare and initialize variables and scanner object
		Scanner input = new Scanner(System.in);
		double waterInKilograms = 0d;
		double initialTemperature = 0d;
		double finalTemperature = 0d;
		
		while (waterInKilograms == 0) {
			// Prompt user for input for all three variables, and store as double
			System.out.printf("Enter the amount of water in kilograms: ");
			waterInKilograms = verifyValue(input.nextLine());
		}
		
		while (initialTemperature == 0) {
			System.out.printf("Enter the initial temperature in Celcius: ");
			initialTemperature = verifyValue(input.nextLine());
		}
		
		while (finalTemperature == 0) {
			System.out.printf("Enter the final temperature in Celsius: ");
			finalTemperature = verifyValue(input.nextLine());
		}
		
		// Calculate the energy needed and store as double
		double energyRequiredToHeat = waterInKilograms * (finalTemperature - initialTemperature) * 4184;
		
		// Output values to user
		System.out.println("The energy needed is " + energyRequiredToHeat);
		
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
