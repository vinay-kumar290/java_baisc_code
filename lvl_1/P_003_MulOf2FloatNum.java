//Q.3 Input two floating numbers and multiply them.

package lvl_1;

import java.util.Scanner;

public class P_003_MulOf2FloatNum {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter 1st float number: ");
		float num1 = input.nextFloat();
		
		System.out.print("Enter 2nd float number: ");
		float num2 = input.nextFloat();
		
		float mul = num1 * num2;
		
		System.out.print("The multiplication of " + num1 + " and " + num2 + " is: " + mul);
		input.close();
	}
}