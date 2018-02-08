/*
 * Displays the following table. Casts floating-point numbers into integers.
 * 		a     b     pow(a, b)
 * 		1     2     1
 * 		2     3     8
 * 		3     4     81
 * 		4     5     1024
 * 		5     6     15625
 * 
 * @author Jay Wilson
 */

public class PowerTable {

	public static void main(String[] args) {
		
		// Output the first column to console
		System.out.format("%-10s%-10s%-10s", "a", "b", "pow(a, b)");
		
		// Loop through all 5 numbers, calculate them, and output 15
		for (int i = 1; i < 6; i++) {
			System.out.format(
					"\n%-10d%-10d%-10d", i, i + 1, (int)Math.pow(i, i + 1));
		}
	}
}
