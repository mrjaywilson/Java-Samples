/*
 * Sums all the digits together of a single number
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		// Declare and initialize variables and objects
		Scanner input = new Scanner(System.in);
		String result = "";
		int calc = 0;
		long divNum = 1;
		long answer = -1;
		
		while (answer == -1) {
			// Prompt user for input
			System.out.println("Enter a number, 10 digits or less: ");
			
			// Get user input and assign to 'answer'
			answer = (long) verifyValue(input.nextLine());
		}
		
		// Ensure div number has the correct number of zeros
		for (int i = 0; i < Long.toString(answer).length() - 1; i++) {
			divNum *= 10;
		}
			
		// Loop through and add up all the digits, storing in 'calc'
		// Additionally, store each digit in 'result' to print to user
		// Loop for calculations
		for (int i = 0; i < Long.toString(answer).length(); i++) {
			// Store numbers in string for output
			result += ((answer / divNum) % 10) + " + ";
			
			// Add up all the numbers by first dividing the number by
			// divNum and getting the result after modulus
			calc += ((answer / divNum) % 10);
			
			// Reduce the division number by one '0'
			// To get the number to run against modulus
			divNum /= 10;
		}

		// After the loop finishes, clean up the end of the string
		// and remove the the additional +. Add on the correct
		// sequence to complete the string output.
		result = result.substring(0, result.length() - 2);
		result += "equals " + calc + ".";
		
		// Print output to user.
		System.out.println("The sum of the digits " + result);
		
		// Clean up
		input.close();
	}
	
	public static long verifyValue(String value) {
		try {
			// Check user input for exit character 'q'
			// If not an exit character, check for validity
			if (value.toUpperCase().equals("Q")) {
				
				// Exit application
				System.exit(0);
			} else if (value.length() > 10) {
				System.out.println("Value too long. Try again or type 'q' to quit.");
				return -1;
			}
			
			// If checks pass, convert input to double and store
			return Long.parseLong(value);
		} catch (Exception e) {
			// Let user know if there is an issue with the input
			System.out.println("Incorrect value. Try again or type 'Q' to exit.");
			return -1;
		}
	}
}