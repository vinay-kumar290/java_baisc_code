package lvl_2;
import java.util.Scanner;

public class P34_CheckPalindromeNum {
	
	//Palindrome: a number that remains the same when its digits are reversed!

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = input.nextInt();
		
		int actual = num;
		int rev = 0;
		
		while (num > 0) {
			
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;	
		}
		if (actual == rev) {
			System.out.println("The number \'" + actual + "\' is a palindrome!");
		}
		else {
			System.out.println("The number \'" + actual + "\' is NOT a palindrome!");
		}	
	}
}