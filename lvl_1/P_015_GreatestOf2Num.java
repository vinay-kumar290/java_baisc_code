//Q.15 Input two numbers → print greater number.

package lvl_1;

import java.util.Scanner;

public class P_015_GreatestOf2Num {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Finding greater number...");
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("The greater number is: " + num1);
		}
		else if (num2 > num1) {
			System.out.println("The greater number is: " + num2);
		}
		else {
			System.out.println("Both number is equal to: " + num1);
		}
		input.close();
	}
}