package lvl_1;

import java.util.Scanner;

public class P04_CharToASCII {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a char: ");
		
		char ch = input.next().charAt(0);
		int ascii = (ch);
		
		System.out.println("ASCII value of '" + ch + "' is: " + ascii);
		input.close();
	}
}