//Q.6 Swap two numbers using a third variable.

package lvl_1;

import java.util.Scanner;

public class P_006_Swap2NumUsingVar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enhter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enhter second number: ");
		int num2 = input.nextInt();
		
		System.out.println("\nFirst number is: " + num1 + "\nSecond number is: " + num2);
		
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.print("\n..After swapping..\nFirst number is: " + num1 + "\nSecond number is: " + num2);
		input.close();
	}
}