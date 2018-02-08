/*
 * Displays the result of the Leibniz formula that computes PI up to 1/13.
 * 
 * @author Jay Wilson
 */

public class OutpuPi {

	public static void main(String[] args) {
		
		// Declare and instantiate variables
		double pi = 0d;
		double denominator = 1d;
		
		// Iterate 13 times and perform proper calculations
		for (int i = 0; i < 14; i++) {
			if (i % 2 == 0) {
				// If even, add the "fraction"
				pi += 1 / denominator;
			} else {
				// If odd, subtract the "fraction"
				pi -= 1 / denominator;
			}
			
			// Increment the denominator
			denominator += 2;
		}
		
		// Perform the final calculation
		pi *= 4;
		
		// Output value to console
		System.out.println(pi);
	}
}
