/*
 * Solves the following equation and displays the value for x and y:
 * 		3.4x + 5.2y = 44.5
 * 		2.1x + .55y = 5.9
 * 
 * @author Jay Wilson
 */

public class EquationSolver {

	public static void main(String[] args) {
		// Calculate the values
		double x = ((44.5 * .55) - (5.2 * 5.9)) / ((3.4 * 5.9) - (5.2 * 2.1));
		double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (5.2 * 2.1));
		
		// Output Calculations
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
