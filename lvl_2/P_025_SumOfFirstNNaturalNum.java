//Q.25 Find sum of first 50 natural numbers.

package lvl_2;
import java.util.Scanner;

public class P_025_SumOfFirstNNaturalNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a natural num.: ");
		int num = input.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			
			sum = sum + i;
		}
		System.out.print("Sum of first \'" + num + "\' natural num is: " + sum);
		input.close();
	}
}
