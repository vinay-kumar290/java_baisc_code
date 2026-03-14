//Q.20 Convert binary to decimal manually.

package lvl_1;

import java.util.Scanner;

public class P_020_BinaryToDecimalManually {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Binary: ");
		String binary = input.nextLine();
		
		int len = binary.length();
		
		int decimal = 0, powr = 0;
		
		for (int i = len - 1; i >= 0; i--) {
			
			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, powr);
			}
			powr++;
		}
		System.out.println("Decimal of " + binary + " is " + decimal);
		input.close();
	}	
}
