/*
 * Reads in investment amount, annual interest rate, 
 * and number of years, and displays the future investment value.
 * 
 * @author Jay Wilson
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class FutureInvestmentValue {

	public static void main(String[] args) {
		
		// Declare and initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		double investmentAmount = 0d;
		double interestRate = 0d;
		double years = 0d;
		
		while (investmentAmount == 0) {
			// Prompt user to enter value
			System.out.print("Enter investment amount: ");
			
			// Store value in double variable
			investmentAmount = verifyValue(input.nextLine(), 0d);
		}

		while (interestRate == 0) {	
			// Prompt user for additional value
			System.out.print("Enter annual interest rate in percentage: ");
			
			// Store value in double variable
			interestRate = verifyValue(input.nextLine(), 0d);
		}

		while (years == 0) {	
			// Prompt user for additional value
			System.out.print("Enter number of years: ");
			
			// Store value in double variable
			years = verifyValue(input.nextLine(), 0d);
		}
		
		// Calculate future investment
		BigDecimal futureInvestment = BigDecimal.valueOf(investmentAmount *
				Math.pow((1 + ((interestRate / 100) / 12)), (years*12)));
		
		// Output value to user
		System.out.println("Accumulated value is $" + futureInvestment.setScale(2, BigDecimal.ROUND_HALF_UP));
		
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
