//Q.1 Write a program to print your name.

package lvl_1;

import java.util.Scanner;

public class P_001_PrintName {
	
	public static void main (String[] args) {
		
		System.out.print("Enter your Name: ");
		
		Scanner input = new Scanner (System.in);
		String name = input.nextLine();
		
		System.out.println("Your name is " + name);
		
		input.close();
	}
}