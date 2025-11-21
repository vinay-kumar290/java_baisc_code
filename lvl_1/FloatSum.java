package lvl_1;
import java.util.Scanner;

public class FloatSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float num1 = input.nextFloat(); 
		
		System.out.print("Enter second number: ");
		float num2 = input.nextFloat(); 

		System.out.print("Sum is: " + (num1 + num2));
		input.close();
	}
}