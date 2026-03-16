//Q.21 Print numbers from 1 to n.

package lvl_2;
import java.util.Scanner;

public class P_021_PrintNumFrom1to100 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Print number from 1 to ?: ");
		int count = input.nextInt();
		
		for (int i = 1; i <= count; i++) {
			
			System.out.print(i + " ");
		}
		input.close();
	}
}
