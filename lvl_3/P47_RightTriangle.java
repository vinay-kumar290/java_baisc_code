package lvl_3;
import java.util.Scanner;

public class P47_RightTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter lenth of right triangle: ");
		int len = sc.nextInt();
		
		if (len <= 0) {
			System.out.println("Invalid input! Try again");
		}
		else {
			
			System.out.println("");
			
			for (int i = 1; i <= len; i++) {
				
				for (int j = 1; j <= i; j++) {
					
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		sc.close();
	}
}