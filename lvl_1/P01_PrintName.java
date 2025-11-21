package lvl_1;

import java.util.Scanner;

public class P01_PrintName {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String name = input.nextLine();
		System.out.println("Your name is: " + name);
		
		input.close();
	}
}