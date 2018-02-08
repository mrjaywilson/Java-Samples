/*
 * Obtains the current time based on a given time zone offset.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		
		// Declare and initialize variables and the scanner object
		Scanner input = new Scanner(System.in);
		String minutes = "";
		
		// Prompt user for input
		System.out.print("Enter time zone offset to GMT: ");
		
		// Get input from user and store in variable
		int offset = (int)verifyValue(input.nextLine());
		
		// Set up variables to work math of figuring out time from milliseconds
		// NOTE: offset and 3600000 setup to enable clean calculation of hour offset
		//		 created by time zones
		long totalMilliseconds = (System.currentTimeMillis() + (3600000 * offset));
		long totalSeconds = (totalMilliseconds / 1000);
		long currentSecond = (totalMilliseconds / 1000) % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		// Output value to user
		if (currentMinutes < 10) {
			minutes = "0" + currentMinutes;
		} else if (currentMinutes == 0) {
			minutes = "00";
		} else {
			minutes += currentMinutes;
		}
		
		System.out.println("Current time is " + currentHour + ":"
				+ minutes + ":"
				+ currentSecond);
		
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