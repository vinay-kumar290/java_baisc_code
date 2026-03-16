//Q.22 Print numbers from 100 to 1.

package lvl_2;
import java.util.Scanner;

public class P_022_PrintNumFrom100to1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Print number from \'?\' to 1: ");
		int count = input.nextInt(); 
		
		for (int i = count; i >= 1; i--) {
			
			System.out.print(i + " ");
		}
		input.close();
	}
}
