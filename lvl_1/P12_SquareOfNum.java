package lvl_1;

import java.util.Scanner;

public class P12_SquareOfNum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		double num = input.nextDouble();
		
		double square = num * num;
		
		System.out.println("Square of " + num + " is " + square);
		input.close();
	}
}