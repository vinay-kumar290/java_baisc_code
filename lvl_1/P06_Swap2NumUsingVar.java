package lvl_1;

import java.util.Scanner;

public class P06_Swap2NumUsingVar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		System.out.println("First number is: " + num1 + "\nSecond number is: " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("--After Swapping-- \nFirst number is: " + num1 + "\nSecond number is: " + num2);
		input.close();
	}
}