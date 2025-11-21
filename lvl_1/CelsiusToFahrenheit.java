package lvl_1;
import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcious: ");
		double cel = input.nextDouble();
		
		double fahren = (cel * 1.8) + 32;
		
		System.out.println("The temp. " + cel + "°C is " + fahren + "°F");
		input.close();
	}
}