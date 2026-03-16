//Print odd numbers from 1–100.

package lvl_2;
import java.util.Scanner;

public class P_024_OddFrom1ToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Print Odd num. from 1 to ?: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i % 2 != 0) {
				
				System.out.print(i + " ");
			}
		}
		input.close();
	}
}
