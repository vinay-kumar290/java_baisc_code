package lvl_3;
import java.util.Scanner;

public class P46_SquareStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a ratio (m*n): ");
		
		System.out.print("Enter number of Row(m): ");
		int m = sc.nextInt();
		
		System.out.print("Enter number of Col(n): ");
		int n = sc.nextInt();
		
		if ((m <= 0) || (n <= 0)) {
			
			System.out.println("Invalid input! try again");
		}
		else {
			
			System.out.println("");
			for (int i = 1; i <= m; i++) {
				
				for (int j = 1; j <= n; j++) {
					
					System.out.print("*  ");
				}
				System.out.println(" ");
			}
		}
		sc.close();
	}
} 