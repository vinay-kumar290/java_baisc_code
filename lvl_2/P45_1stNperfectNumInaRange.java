package lvl_2;
import java.util.Scanner;

public class P45_1stNperfectNumInaRange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a range: ");
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		

		if (num2 < num1) {
			
			System.out.print("Invalid try again: ");
		}
		else {
			
			for (int i = num1; i <= num2; i++) {
				
				int sum = 0;
				
				for (int j = 1; j < i; j++) {
					
					if (i % j == 0) {	
						sum = sum + j;
					}
				}
				
				if (sum == i) {
					System.out.print(sum + " ");
				}
			}
		}
		input.close();
	}
}
