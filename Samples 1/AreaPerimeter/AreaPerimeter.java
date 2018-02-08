/*
 * Displays the area and perimeter of a circle that has a radius of 5.5
 * 
 * @author Jay Wilson
 */

public class AreaPerimeter {

	public static void main(String[] args) {
		
		// Calculate perimeter and area of a circle with 5.5 radius
		double perimeter = 2 * 5.5 * Math.PI;
		double area = Math.pow(5.5, 2) * Math.PI;
		
		// Output calculations to the console
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}
}
