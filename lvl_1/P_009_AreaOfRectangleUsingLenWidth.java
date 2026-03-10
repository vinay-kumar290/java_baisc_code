//Q.9 Input length and width and print area of a rectangle.

package lvl_1;

import java.util.Scanner;

public class P_009_AreaOfRectangleUsingLenWidth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter lenght in cm: ");
		double length = input.nextDouble();
		
		System.out.print("Enter width in cm: ");
		double width = input.nextDouble();
		
		double area = (length * width);
		System.out.println("Area of rectangle is: " + area + "cm²");
		
		input.close();
	}
}