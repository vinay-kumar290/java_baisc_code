package lvl_2;
import java.util.Scanner;

public class P39_LCMof2Num {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int a = num1;
        int b = num2;
        
        //Euclid’s Algorithm
        while (b != 0) {
        	
        	int temp = b;
        	b = a % b;
        	a = temp;
        }
        int hcf = a;
        int lcm = (num1 * num2) / hcf;
        
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        input.close();
	}
}