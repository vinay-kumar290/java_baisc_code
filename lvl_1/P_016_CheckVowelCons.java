//Q.16 Input a character → check if it is vowel or consonant.

package lvl_1;

import java.util.Scanner;

public class P_016_CheckVowelCons {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a Charactor: ");
		String str = input.nextLine();
		
		char ch = str.charAt(0);
		
		char lower = Character.toLowerCase(ch);
		
		boolean isVow = false;
		
		switch(lower) {
		
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				isVow = true;
				break;
		}
		if(isVow == true) {
			System.out.println("\'" + str + "\' is vowel");
		}
		else {
			System.out.println("\'" + str + "\' is consonent");
		}
		input.close();
	}
}