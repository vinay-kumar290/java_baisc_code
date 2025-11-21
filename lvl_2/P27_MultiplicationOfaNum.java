package lvl_2;
import java.util.Scanner;

public class P27_MultiplicationOfaNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = input.nextInt();
		int mul = 0;
		
		System.out.println("Multiplication of " + num + " is:");
		
		for(int i = 1; i <= 10; i++) {
			
			mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);
		}
		input.close();
	}
}