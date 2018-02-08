/*
 * Displays the Miles Per Hour for a runner. Assumes runner ran 14 kilometers in 45 minutes and 30 seconds.
 * 
 * @author Jay Wilson
 */

public class RunnerMPH {

	public static void main(String[] args) {
		
		// Calculate the speed
		double MPH = ((14 / 1.6) / 3) * 4;
		
		// Output calculation to the console
		System.out.println(MPH);
	}
}