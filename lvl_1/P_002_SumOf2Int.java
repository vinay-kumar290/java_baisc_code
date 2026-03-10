//Q.2 Input two integers and print their sum.

package lvl_1;

import java.util.Scanner;

public class P_002_SumOf2Int {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter 2nd integer: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		input.close();
	}
}