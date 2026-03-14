//Q.18 Input time → greet Good Morning / Afternoon / Night.

package lvl_1;

import java.util.Scanner;

public class P_018_TimeGreeting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter time - (in format): hh:mm AM/PM");
		String time = input.nextLine();
		
		String hhStr = time.substring(0, 2);
		String mmStr = time.substring(3, 5);
		
		int hh = Integer.parseInt(hhStr);
		int mm = Integer.parseInt(mmStr);

		char op = time.charAt(time.length() - 2);
		char lower = Character.toLowerCase(op);
		
		switch(lower) {
		
		case 'a':
			if((hh >= 5 ) && (hh <= 11)) {
				
				if ((mm >= 0) && (mm < 60)) {
					System.out.println("Good morning!");
				}	
			}
			else {
				System.out.println("Good night!");
			}
			break;
			
		case 'p':
			if((hh == 12) || ((hh >= 1) && (hh <= 4))) {
				if ((mm >= 0) && (mm < 60)) {
					System.out.println("Good Afternoon!");
				}
			}
			
			else if ((hh > 4) && (hh <= 8)) {
				if((mm >= 0) && (mm < 60)) {
					System.out.println("Good evening!");
				}
			}
			else {
				System.out.println("Good night!");
			}
			break;
			
		 default:
             System.out.println("Invalid time format! Try again.");
		}
		input.close();


	}

}
