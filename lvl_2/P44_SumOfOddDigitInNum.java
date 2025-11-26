package lvl_2;
import java.util.Scanner;

public class P44_SumOfOddDigitInNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		String strNum = input.nextLine();
		
		int len = strNum.length();
		int sum = 0;
		
		if (len <= 0) {
			
			System.out.println("enter a valid number!");
		}
		else {
			
			for (int i = 0; i <= len - 1; i++) {
				
				char numCh = strNum.charAt(i);
				int num = Character.getNumericValue(numCh);
				
				if (num % 2 != 0) {
					
					sum = sum + num;
				}
			}
			System.out.println("Sum Of Even Digit of Num " + sum);
		}
		input.close();
	}
}