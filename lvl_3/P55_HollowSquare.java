package lvl_3;
import java.util.Scanner;

public class P55_HollowSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side of a square: ");
		int side = sc.nextInt();
		
		if (side <= 1) {
			System.out.println("Inavlid entry. Try again!");
		}
		else {
			System.out.println("");
			
			for (int i = 0; i < side; i++) {
				
				for (int j = 0; j < side; j++) {
					
					if ((i == 0) || (i == side - 1) || (j == 0) || (j == side - 1)) {
						System.out.print("*  ");
					}
					else {
						System.out.print("   ");
					}
				}
				System.out.println("");
			}
		}
		sc.close();
	}
}