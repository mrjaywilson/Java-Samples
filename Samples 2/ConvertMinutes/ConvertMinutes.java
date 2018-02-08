/*
 * Converts minutes into years and days. For simplicity, assumes all years
 * have 365 days.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ConvertMinutes {

	public static void main(String[] args) {
		
		// Setup variables and objects
		Scanner input = new Scanner(System.in);
		final double MINS_IN_YEAR = (60 * 24) * 365;
		final double DAYS_PER_YEAR = 365;
		double years = 0;
		double days = 0;
		long minutes = 0;
		
		while (minutes == 0) {
			
			// Prompt user for input
			System.out.print("Enter number of minutes to convert: ");
			
			// get input and store in long variable
			minutes = (long)verifyValue(input.nextLine());
		}

		// Calculate years and days based on number of minutes
		years = minutes / MINS_IN_YEAR;
		days = DAYS_PER_YEAR * (years - Math.floor(years));
		
		// Output to user the values casted to int for whole numbers
		System.out.println(minutes + " minutes is approximately "
				+ (int)years + " years and " + (int)days + " days");
		
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
		return 0d;
	}
}
