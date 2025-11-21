package lvl_1;

import java.util.Scanner;

public class P17_CheckLeapYear {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {
				
				if (year % 400 ==0) {
					
					System.out.println("The year " + year + " is a leap year.");
				}
				else {
					System.out.println("The year " + year + " is not a leap year.");
				}
			}
			else {
				System.out.println("The year " + year + " is a leap year.");
			}
		}
		else {
			System.out.println("The year " + year + " is not a leap year.");
		}
		input.close();
	}
}