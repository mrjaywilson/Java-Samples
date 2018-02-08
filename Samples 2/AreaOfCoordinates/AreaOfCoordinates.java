/*
 * Prompts the user to enter three points (x1, y1), 
 * (x2, y2), (x3, y3) of a triangle and displays its area.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import com.sun.javafx.geom.Point2D;
import java.math.BigDecimal;

public class AreaOfCoordinates {

	public static void main(String[] args) {
		
		// Declare and initialize objects
		Scanner input = new Scanner(System.in);
		Point2D pointOne = new Point2D(-1337, -1337);
		Point2D pointTwo = new Point2D(-1337, -1337);
		Point2D pointThree = new Point2D(-1337, -1337);
		
		while (pointOne.x == -1337) {
			// Prompt user for input
			System.out.print("Enter x1: ");
			
			pointOne.x = (float)verifyValue(input.nextLine(), -1337);
		}
		
		while (pointOne.y == -1337) {
			// Prompt user for input
			System.out.print("Enter y1: ");
			
			pointOne.y = (float)verifyValue(input.nextLine(), -1337);
		}

		while (pointTwo.x == -1337) {
			// Prompt user for input
			System.out.print("Enter x2: ");
			
			pointTwo.x = (float)verifyValue(input.nextLine(), -1337);
		}
		
		while (pointTwo.y == -1337) {
			// Prompt user for input
			System.out.print("Enter y2: ");
			
			pointTwo.y = (float)verifyValue(input.nextLine(), -1337);
		}

		while (pointThree.x == -1337) {
			// Prompt user for input
			System.out.print("Enter x3: ");
			
			pointThree.x = (float)verifyValue(input.nextLine(), -1337);
		}
		
		while (pointThree.y == -1337) {
			// Prompt user for input
			System.out.print("Enter y3: ");
			
			pointThree.y = (float)verifyValue(input.nextLine(), -1337);
		}

		// Calculate the area of the triangle: 
		// Get the distance from each side and store in array
		double side[] = new double[3];
		
		side [0] = Math.pow(Math.pow((pointOne.x - pointTwo.x), 2)
			+ Math.pow((pointOne.y - pointTwo.y), 2), 0.5);
		
		side [1] = Math.pow(Math.pow((pointTwo.x - pointThree.x), 2)
				+ Math.pow((pointTwo.y - pointThree.y), 2), 0.5);
		
		side [2] = Math.pow(Math.pow((pointThree.x - pointOne.x), 2)
				+ Math.pow((pointThree.y - pointOne.y), 2), 0.5);

		// Use sides stored in array to get 's' for formula
		double s = (side[0] + side[1] + side[2]) / 2;
		
		// Calculate formula using s and sides
		BigDecimal area = BigDecimal.valueOf(Math.pow((s * (s - side[0]) * (s - side[1]) * (s - side[2])), .5));
		
		// Output the result to the user to two decimal points
		System.out.println("The area of the triangle is: " + area.setScale(2, BigDecimal.ROUND_HALF_UP));
		
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
