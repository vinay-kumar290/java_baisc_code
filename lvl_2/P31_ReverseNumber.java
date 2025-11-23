package lvl_2;
import java.util.Scanner;

public class P31_ReverseNumber {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");

		int num = input.nextInt();
		
		int temp = num;
		int rev = 0;
		
		while (num > 0) {
			
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reversed number of " + temp + " is " + rev);
		input.close();
	}
}