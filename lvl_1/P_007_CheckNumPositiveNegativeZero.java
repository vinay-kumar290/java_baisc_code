//Q.7 Check whether a number is positive, negative, or zero.

package lvl_1;

import java.util.Scanner;

public class P_007_CheckNumPositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if (num < 0) {
			System.out.print(num + " is a negative value.");
		}
		
		else if (num > 0) {
			System.out.print(num + " is a positive value.");
		}
		
		else {
			System.out.print(num + " is a zero value.");
			
		}
		input.close();
	}
}