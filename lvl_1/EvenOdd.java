package lvl_1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The number " + num + " is even");
		}
		else {
			System.out.println("The number " + num + " is odd");
		}
		input.close();
	}
}