package lvl_1;
import java.util.Scanner;

public class PercentOfSub {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter marks of Physics: ");
		double phy = input.nextDouble();
		
		System.out.print("Enter marks of Chemistry: ");
		double chem = input.nextDouble();
		
		System.out.print("Enter marks of Math: ");
		double math = input.nextDouble();
		
		System.out.print("Enter marks of Hindi: ");
		double hindi = input.nextDouble();
		
		System.out.print("Enter marks of English: ");
		double eng = input.nextDouble();
		
		double total = phy + chem + math + hindi + eng;
		double percent = (total / 5);
		
		System.out.println("Total marks: " + total);
		System.out.println("Percentage: " + percent);
		
		input.close();
	}
}
