package lvl_3;
import java.util.Scanner;

public class P50_Reversed_Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base length: ");
		int len = sc.nextInt();
		
		int space = 0;
		
		if (len <= 0) {
			System.out.println("Invalid try Again");
		}
		else {
			
			for (int i = len; i > 0;) {
				
				for (int s = 1; s <= space; s++) {
					
					System.out.print(" ");
				}
				
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println(" ");
				
				i = i - 1;
				space++;
			}
		}
		sc.close();
	}
}