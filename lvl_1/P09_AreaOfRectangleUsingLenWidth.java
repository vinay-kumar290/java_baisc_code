package lvl_1;

import java.util.Scanner;

public class P09_AreaOfRectangleUsingLenWidth {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter lenght in cm: ");
		double length = input.nextDouble();
		
		System.out.print("Enter width in cm: ");
		double width = input.nextDouble();
		
		double area = (length + width) * 2;
		System.out.println("Area is: " + area + " cm²");
		
		input.close();
	}
}