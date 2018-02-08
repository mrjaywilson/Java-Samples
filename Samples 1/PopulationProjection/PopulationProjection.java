/*
 * The U.S. Census Bureau projects population based on the following assumptions:
 * 		1) One birth every 7 seconds
 * 		2) One death every 13 seconds
 * 		3) One new immigrant every 45 seconds
 * Displays the population for each of the next five years. 
 * Assumes the current population is 312,032,486 and one year has 365 days.
 * 
 * @author Jay Wilson
 */

public class PopulationProjection {

	public static void main(String[] args) {
		// Setup and initialize variables
		double population = 312032486;
		int daysInYear = 365;

		// Calculate and store in double-size variables
		double births = (((double)60 / 7) * 1440);
		double deaths = (((double)60 / 13) * 1440);
		double immigrants = (((double)60 / 45) * 1440);
		
		// Iterate 5 times (representing years)
		for (int i = 1; i < 6; i++) {
			
			// Calculate the year's estimated population
			double estimatedPopulation =
					(double)(population + ((births * (i * daysInYear))
					- (deaths * (i * daysInYear)))
					+ (immigrants * (i * daysInYear)));
			
			// Print calculation to console
			System.out.println("Year " + i + " Population Estimate: " + (int)estimatedPopulation);
		}
	}
}