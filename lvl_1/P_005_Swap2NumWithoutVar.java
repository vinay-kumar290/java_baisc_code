//Q.5 Swap two numbers without using a third variable.

package lvl_1;

import java.util.Scanner;

public class P_005_Swap2NumWithoutVar {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		System.out.println("\nFirst number is: " + num1 + "\nSecond number is: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.print("\n..After swapping..\nFirst number is: " + num1 + "\nSecond number is: " + num2);
		input.close();
	}

}
