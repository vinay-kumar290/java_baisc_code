//Q.14 Input name, age, and salary → print formatted output.

package lvl_1;

import java.util.Scanner;

public class P_014_PrintNameAgeSalary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your Age: ");
		int age = input.nextInt();
		
		System.out.print("Enter your Salary: ");
		int sal = input.nextInt();
		
		System.out.print(name + " is " + age + " years old and his salary is " + sal + ". Awesome!");
		
		input.close();
	}
}