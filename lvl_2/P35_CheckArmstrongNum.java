package lvl_2;
import java.util.Scanner;

public class P35_CheckArmstrongNum {
	
//Armstrong: a number that is equal to the sum of its own digits each raised to the power of the total number of digits in the number

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = input.nextInt();
		
		int original = num;
		
		int digit = 0;
		
		
		int temp = num;
		while (temp > 0) {
			
			digit++;
			temp = temp / 10;
		}
		
		int temp2 = num;
		int sum = 0;
		
		while (temp2 > 0) {
			
			int rem = temp2 % 10;
			sum += Math.pow(rem, digit);
			temp2 = temp2 / 10;
		}
		if (sum == original) {
			
			System.out.println("Number " + original + " is armstrong:");
			
		}
		else {
			System.out.println("Number " + original + " is not armstrong:");
		}
		input.close();
	}
}