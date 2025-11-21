package lvl_1;

import java.util.Scanner;

public class P16_CharVowelCons {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a char: ");
		char ch = input.next().charAt(0);
		
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
			System.out.println("The char \'" + ch + "\' is vowel");
		}
		else {
			System.out.println("The char \'" + ch + "\' is consonent");
		}
		input.close();
	}
}
