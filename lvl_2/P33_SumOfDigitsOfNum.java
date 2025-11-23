package lvl_2;
import java.util.Scanner;

public class P33_SumOfDigitsOfNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = input.nextInt();
		
		int actual = num;
		int sum = 0;
		
		while (num > 0) {
			
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of digits of number \'" + actual + "\' is " + sum + "!");
		input.close();
	}
}