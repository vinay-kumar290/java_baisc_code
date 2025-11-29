package lvl_3;
import java.util.Scanner;

public class P51_NumberTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		int len = sc.nextInt();
		
		int space = len;
		
		if (len <= 0) {
			System.out.println("Invalid try Again");
		}
		else {
			for (int i = 1; i <= len;) {
				
				for (int s = space; s > 0; s--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println("");
				
				i = i + 1;
				space--;
			}
		}
		sc.close();
	}
}