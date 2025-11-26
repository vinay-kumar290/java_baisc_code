package lvl_2;
import java.util.Scanner;

public class P38_HCFof2Num {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		int a = num1;
		int b = num2;
		
		while (b != 0) {
			
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + a);
        input.close();
	}
}