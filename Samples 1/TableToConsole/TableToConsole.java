/*
 * Displays a table of powers to the console.
 * 
 * @author Jay Wilson
 */

public class TableToConsole {

	public static void main(String[] args) {
		
		// Output column headers values to console
		System.out.format("%-10s%-10s%-10s", "a", "a^2", "a^3");
		
		// Loop through each number and perform power calculation based on column requirement
		// Output to console
		for (int i = 1; i < 5; i++) {
			System.out.format("\n%-10s%-10s%-10s", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
		}
	}
}