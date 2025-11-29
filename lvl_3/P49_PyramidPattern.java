package lvl_3;
import java.util.Scanner;

public class P49_PyramidPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base length: ");
		int len = sc.nextInt();
		
		int space = len;
		
		if (len <= 0) {
			System.out.println("Enter a valid number!");
		}
		else {
				
			for (int i = 1; i <= len;) {
				
				for (int s = space - 1; s > 0; s--) {
					System.out.print(" ");
				}
					
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");	
				}
				
				System.out.println("");
				i = i + 1;
					
				space--;
			}	
		}
		sc.close();
	}
}