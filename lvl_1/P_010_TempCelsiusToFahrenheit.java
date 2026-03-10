//Q.10 Input temperature in Celsius and convert to Fahrenheit.

package lvl_1;

import java.util.Scanner;

public class P_010_TempCelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcious: ");
		double cel = input.nextDouble();
		
		double fah = (cel * 1.8) + 32;
		
		System.out.print("Temperature: " + cel + "°C = " + fah + "°F");
		
		input.close();
	}
}