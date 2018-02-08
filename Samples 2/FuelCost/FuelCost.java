/*
 * Prompts the user to enter the distance to drive, the fuel 
 * efficiency of the car in miles per gallon, and the price per gallon, and displays 
 * the cost of the trip.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class FuelCost {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double distance = 0d;
		double milesPerGallon = 0d;
		double fuelCost = 0d;
		
		while (distance == 0) {
			// Prompt the user for input
			System.out.print("Enter the driving distance: ");
	
			// Get distance from user and store as float
			distance = verifyValue(input.nextLine(), 0);
		}

		while (milesPerGallon == 0) {
			// Prompt user for additional input
			System.out.print("Enter miles per gallon: ");
	
			// Get MPG from user and store as float
			milesPerGallon = verifyValue(input.nextLine(), 0);
		}

		while (fuelCost == 0) {
			// Prompt user for additional input
			System.out.print("Enter cost per gallon: ");
	
			// Get cost of gas and store in double
			fuelCost = verifyValue(input.nextLine(), 0);
		}

		// Calculate cost of driving
		BigDecimal totalCost = BigDecimal.valueOf((distance / milesPerGallon) * fuelCost);

		// Output to user
		System.out.println("The cost of driving is $" + totalCost.setScale(2, BigDecimal.ROUND_HALF_UP));
		
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
