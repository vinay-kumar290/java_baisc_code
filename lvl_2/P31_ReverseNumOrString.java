package lvl_2;
import java.util.Scanner;

public class P31_ReverseNumOrString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number/String: ");

		String strNum = input.next();
		int len = strNum.length();
		
		System.out.print("Reversed Number/String is: ");

		int i = 0;

		if(len == 0) {
			System.out.println("Enter a valid Number/String.");
		}
		else {

			for (i = len - 1; i >= 0; i--) {

				System.out.print(strNum.charAt(i));
			}
		}
		input.close();
	}
}