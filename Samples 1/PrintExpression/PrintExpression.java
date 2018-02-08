/*
 * Displays the result of an expression.
 * 
 * @author Jay Wilson
 */

public class PrintExpression {

	public static void main(String[] args) {
		
		// Compute the formula and store in a variable
		double result = ((9.5f * 4.5f) - (2.5f * 3f)) / (45.5f - 3.5f);
		
		// Output the answer to console
		System.out.println("((9.5f * 4.5f) - (2.5f * 3f)) / (45.5f - 3.5f) = " + result);
	}
}
