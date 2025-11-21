package lvl_1;
import java.util.Scanner;

public class FormatedOut {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		System.out.print("Enter your salary: ");
		int salary = input.nextInt();
		
		System.out.println("Hey " + name + ", you are " + age + " years old and earning " + salary + " in a month.");
		input.close();
	}
}