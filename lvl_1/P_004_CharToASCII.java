//Q.4 Input a character and print its ASCII value.

package lvl_1;

import java.util.Scanner;

public class P_004_CharToASCII {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a Char: ");
		char ch = input.next().charAt(0);
		
		int ascii = ch;
		
		System.out.print("The ASCII value of " + ch + " is: " + ascii);
		
		input.close();
	}
}