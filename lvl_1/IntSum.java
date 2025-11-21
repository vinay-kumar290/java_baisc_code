package lvl_1;
import java.util.Scanner;

public class IntSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt(); 
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt(); 

		System.out.print("Sum is: " + (num1 + num2));
		input.close();
	}
}