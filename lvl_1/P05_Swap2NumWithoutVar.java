package lvl_1;

import java.util.Scanner;

public class P05_Swap2NumWithoutVar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		System.out.println("\nFirst number is: " + num1 + "\nSecond number is: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("...After Swapping... \nFirst number is: " + num1 + "\nSecond number is: " + num2);
		input.close();
	}
}