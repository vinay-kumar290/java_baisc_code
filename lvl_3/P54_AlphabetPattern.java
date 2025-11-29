package lvl_3;
import java.util.Scanner;

public class P54_AlphabetPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Row: ");
		int row = sc.nextInt();
		
		if (row <= 0 || row > 26) {
			System.out.println("Invalid input (enter 1 - 26)");
		}
		else {
			
			for (int i = 0; i < row; i++) {
				
				for (char ch = 'A'; ch <= i + 65; ch++) {
					
					System.out.print(ch);
				}
				System.out.print(", ");
			}
		}
		sc.close();
	}
}