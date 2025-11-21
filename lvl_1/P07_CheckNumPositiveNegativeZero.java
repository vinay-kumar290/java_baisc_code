package lvl_1;

import java.util.Scanner;

public class P07_CheckNumPositiveNegativeZero {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = input.nextInt();
		
		if(num > 0) {
			System.out.println("The number \'" + num + "\' is positive.");
		}
		else if(num < 0) {
			System.out.println("The number \'" + num + "\' is negative.");
		}
		else {
			System.out.println("The number \'" + num + "\' is zero.");
		}
		input.close();
	}
}