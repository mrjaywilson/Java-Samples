/*
 * Assumea a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds. 
 * Displays the average speed in kilometers per hour.
 * 
 * @author Jay Wilson
 */

public class RunnerKPH {

	public static void main(String[] args) {
		// calculate number of seconds in an hour based on runner's time
		double totalTimeInSeconds = 3600 + (40 * 60) + 35;

		// Calculate kilometers per second
		double kilosPerSecond = (24 * 1.6) / totalTimeInSeconds;
		
		// Output kilometers per second multiplied by 3600 (seconds in hour)
		System.out.println(kilosPerSecond * 3600);
	}

}
