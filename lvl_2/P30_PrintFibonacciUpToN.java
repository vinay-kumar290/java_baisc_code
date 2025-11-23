package lvl_2;
import java.util.Scanner;

public class P30_PrintFibonacciUpToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = input.nextInt();
		
		int a = 0, b = 1;
		int sum = 0;
		
		System.out.println("Fibonacci Series upto " + num + " term is:");
		System.out.print(a + ", " + b + ", ");
		
		for(int i = 1; i <= num - 2; i++) {
			
			sum = a + b;
			System.out.print(sum + ", ");	
			
			a = b;
			b = sum;
		}
		input.close();
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...