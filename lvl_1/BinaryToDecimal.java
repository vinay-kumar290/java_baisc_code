package lvl_1;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a Binary: ");
		String numStr = input.nextLine();
		
		int len = numStr.length();
		int i = 0, dec = 0; 
		int p = 0;
		if (len > 0) {
			for (i = len - 1; i >= 0; i--) {
				if (numStr.charAt(i) == '1') {
					dec += Math.pow(2, p);
				}
		        p++;
		    }
		}
		System.out.println("Decimal of " + numStr + " is " + dec);
		input.close();
	}
}