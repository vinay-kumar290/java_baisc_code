package lvl_3;

import java.util.Scanner;

public class P52_FloydTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter column: ");
		int col = sc.nextInt();
		
		int num = 1;
		
		if (col <= 0) {
			System.out.println("Invalid entry. Try again!");
		}
		else {
			
			for (int i = 1; i <= col; i++) {
				
				for (int j = 1; j <= i; j++) {
					
					System.out.print(num + " ");
					num++;
				}
				System.out.println("");	
			}
		}
		sc.close();
	}
}

