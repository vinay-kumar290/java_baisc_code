//Q.13 Input a number and print whether it is even or odd.

package lvl_1;

import java.util.Scanner;

public class P_013_CheckEvenOdd {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.print("\nThe number " + num + " is Even.");
		}
		else {
			System.out.print("\nThe number " + num + " is Odd.");
		}
		input.close();
	}
}