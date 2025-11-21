package lvl_1;

import java.util.Scanner;

public class P08_AreaOfCircleUsingRadius {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radious of Circle in cm: ");
		double rad = input.nextDouble();
		
		double area = ((22 * rad * rad) / 7);
		
		System.out.println("Area is: " + area + " cm²");
		input.close();
	}
}