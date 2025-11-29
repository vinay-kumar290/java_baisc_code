package lvl_3;
import java.util.Scanner;

public class P48_InvertedTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		int len = sc.nextInt();
		
		int space = 0;
		
		if (len <= 0) {
			
			System.out.println("Invalid input!");
		}
		else {
			
			for (int i = len; i > 0;) {
				
				for (int s = 0; s <= space; s++) {
                    System.out.print(" ");
				}
				
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				
				System.out.println("");
				i = i - 2;
				
				space++;
				space++;
			}
		}
		sc.close();
	}
}