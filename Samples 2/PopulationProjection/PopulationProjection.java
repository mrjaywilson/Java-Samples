/*
 * Projects the population for number of years input by user. Assumes a year only has 365 days.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class PopulationProjection {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object
		Scanner input = new Scanner(System.in);
		
		// Set these to FINAL since they don't change for this exercise
		final int CURRENT_POPULATION = 312032486;
		final int DAYS_IN_YEAR = 365;

		// Calculate and store in double size variables
		double births = (((double)60 / 7) * 1440) * DAYS_IN_YEAR;
		double deaths = (((double)60 / 13) * 1440) * DAYS_IN_YEAR;
		double immigrants = (((double)60 / 45) * 1440) * DAYS_IN_YEAR;
		
		int years = 0;
		
		while (years == 0) {
			// Get user input for number of years
			System.out.printf("Enter the number of years: ");
			years = (int)verifyValue(input.nextLine());
		}
		
		// Calculate population and store in double variable
		double estimatedPopulation = 
				(((double)CURRENT_POPULATION + (births * years))
						- (deaths * years))
						+ (immigrants * years);
		
		// Output values to user
		// NOTE: estimatedPopulation cast to int for give whole number
		System.out.println("The population in " + years
				+ " years is " + (int)estimatedPopulation);
		
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
