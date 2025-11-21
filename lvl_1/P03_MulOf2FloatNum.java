package lvl_1;

import java.util.Scanner;

public class P03_MulOf2FloatNum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float num1 = input.nextFloat(); 
		
		System.out.print("Enter second number: ");
		float num2 = input.nextFloat(); 

		System.out.print("Multiplication is: " + (num1 * num2));
		input.close();
	}
}