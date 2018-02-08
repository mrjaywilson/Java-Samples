/*
 * Prompts the user to enter two points (x1, y1) and (x2, y2) 
 * and displays their distance between them.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import com.sun.javafx.geom.Point2D;

public class DistanceBetweenPoints {

	public static void main(String[] args) {
		
		// Declare and initialize objects
		Scanner input = new Scanner(System.in);
		Point2D locationOne = new Point2D(-1337, -1337);
		Point2D locationTwo = new Point2D(-1337, -1337);
				
		while (locationOne.x == -1337 || locationOne.y == -1337) {
			// Prompt user for input
			System.out.print("Enter x1: ");
			
			// Get user input and store each answer in a string array
			locationOne.x = (float)verifyValue(input.nextLine());

			// Prompt user for input
			System.out.print("Enter y1: ");
			
			// Get user input and store each answer in a string array
			locationOne.y = (float)verifyValue(input.nextLine());
		}
		
		while (locationTwo.x == -1337 || locationTwo.y == -1337) {
			// Prompt user for input
			System.out.print("Enter x2: ");
			
			// Get user input and store each answer in a string array
			locationTwo.x = (float)verifyValue(input.nextLine());

			// Prompt user for input
			System.out.print("Enter y2: ");
			
			// Get user input and store each answer in a string array
			locationTwo.y = (float)verifyValue(input.nextLine());
		}
		
		// Calculate the distance between the two points
		double distance = Math.pow(
				Math.pow((double)locationTwo.x
						- (double)locationOne.x, 2)
				+ Math.pow((double)(locationTwo.y
						- (double)locationOne.y), 2)
				, 0.5);
		
		// Output values to user
		System.out.println("The distance between the two points is "
				+ distance);
		
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
		return -1337d;
	}
}
