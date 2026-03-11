//Q.12 Input a number and print its square.

package lvl_1;

import java.util.Scanner;

public class P_012_SquareOfNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		System.out.print("\nSquare of " + num + " is: " + (num * num));
		
		input.close();
	}
}