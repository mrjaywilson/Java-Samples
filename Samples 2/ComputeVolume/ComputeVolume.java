/*
 * Reads in the radius and length of a cylinder and computes 
 * the area and volume using the following formulas:
 * 		area = radius * radius * pi
 * 		volume = area * length
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class ComputeVolume {

	// Declare and initialize input object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Declare and initialize variables
		double radius = 0d;
		double length = 0d;
		
		// Loop until proper value input or user quits
		while (radius == 0) {
			// Prompt user for input
			System.out.print("Enter the radius of your cylnder: ");
			
			// Method to verify value and return value if good or
			// 0 if no good.
			radius = verifyValue(input.nextLine());
		}
		
		// Loop until proper value input or user quits
		while (length == 0) {
		
			// Prompt user for input
			System.out.print("Enter the length of your cylnder: ");
			
			// Method to verify value and return value if good or
			// 0 if no good.
			length = verifyValue(input.nextLine());
		}
		
		// If all checks pass and user has not exited, perform calculations
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;

		// Output values to user
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
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