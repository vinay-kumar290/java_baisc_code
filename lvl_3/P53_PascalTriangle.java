package lvl_3;
import java.util.Scanner;

public class P53_PascalTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Row: ");
		int row = sc.nextInt();
		
		int space = row;
		
		if (row <= 0) {
			System.out.println("Incorrect input!");
		}
		else {
			
			for (int i = 0; i < row; i++) {
				
				for (int s = space; s >= 0; s--) {
					System.out.print(" ");
				}
				int pascal = 1;
				
				for (int j = 0; j <= i; j++) {
					
					System.out.print(pascal + " ");
					pascal = pascal * (i - j) / (j + 1);
				}
				System.out.println("");
				space--;
			}
		}
		sc.close();
	}
}