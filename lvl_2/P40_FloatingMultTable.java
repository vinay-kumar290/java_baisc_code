package lvl_2;
import java.util.Scanner;

public class P40_FloatingMultTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a floating number: ");
		float num = input.nextFloat();
		
		System.out.println("Multiplication Table of " + num);
		
		for (int i = 1; i <= 10; i++) {
			
			float res = num * i;
			System.out.println(num + " * " + i + " = " + res);
		}
		input.close();
	}
}