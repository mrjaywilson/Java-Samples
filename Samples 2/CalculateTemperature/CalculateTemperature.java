/*
 * Reads a Celsius degree in a double value from the console, 
 * then converts it to Fahrenheit and displays the result.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;

public class CalculateTemperature {

	public static void main(String[] args) {
		
		// Declare initialize input object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input to convert
		System.out.printf("Enter a fahrenheit temperature: ");
		
		// Get input and store in variable
		double temp = input.nextDouble();
		
		// Perform calculation, and store value back in variable
		double calc = (temp - 32) / (9/5);
		
		// Output to console the result of the calculation
		System.out.printf("\n%sF is equivalent to %sC.", (int)temp, (int)calc);

		// Prompt user for additional input to convert
		System.out.printf("\n\nEnter a celsius temperature: ");
		
		// Get input and store in variable
		temp = input.nextDouble();
		
		// Calculate Celsius and store back into variable
		calc = (temp * (9/5)) + 32;
		
		// Output conversion of Fahrenheit to Celsius
		System.out.printf("\n%sC is equivalent to %sF.", (int)temp, (int)calc);
		
		// Clean Up
		input.close();
	}
}
