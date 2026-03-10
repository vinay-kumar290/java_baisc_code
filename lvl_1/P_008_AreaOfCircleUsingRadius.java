//Q.8 Input radius and print the area of a circle.

package lvl_1;

import java.util.Scanner;

public class P_008_AreaOfCircleUsingRadius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter radius of a circle in cm: ");
		float rad = input.nextFloat();
		
		float area = (22 * rad * rad) / 7;
		
		System.out.print("Are of ciercle is: " + area + " cm²");
		
		input.close();
	}
}