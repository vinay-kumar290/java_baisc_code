//Q.11 Input marks of n subjects and print total and percentage.

package lvl_1;

import java.util.Scanner;

public class P_011_PercentOf5Subj {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of subjects: ");
		int subs = input.nextInt();
		
		System.out.print("\n");
		
		double sum = 0;
		
		for (int i = 1; i <= subs; i++) {
			
			System.out.print("Enter the marks of Sub-" + i + ": ");
			double marks = input.nextDouble();
			
			sum = sum + marks;
		}
		
		double percent = (sum / subs);
		
		System.out.println("\nTotal Marks: " + sum);
		System.out.println("Percentage: " + percent + "%");
		
		input.close();
	}
}