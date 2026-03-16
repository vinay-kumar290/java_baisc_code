//Q.23 Print even numbers from 1–n.

package lvl_2;
import java.util.Scanner;

public class P_023_EvenFrom1toN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Print Even num. from 1 to ?: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i % 2 == 0) {
				
				System.out.print(i + " ");			}
		}
		input.close();
	}
}
