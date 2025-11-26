package lvl_2;
import java.util.Scanner;

public class P37_FactorsOfaNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = input.nextInt();
		
		System.out.println("Factors of " + num + " is: ");
		
		if (num < 0) {
			
			System.out.println("Enter a positive number.");
		}
		else {
			
			for (int i = 1; i <= num; i++) {
				
				if (num % i == 0) {
					
					System.out.print(i + " ");
				}
			}
		}
		input.close();
	}
}