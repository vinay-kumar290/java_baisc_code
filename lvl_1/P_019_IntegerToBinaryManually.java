//Q.19 Convert an integer to binary manually (no Java methods).

package lvl_1;

import java.util.Scanner;

public class P_019_IntegerToBinaryManually {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		String binary = "";
		int temp = num;
		
		while (temp > 0) {
			
			int reminder = temp % 2;
			binary = reminder + binary;
			
			temp = temp / 2;
		}
        int len = binary.length();
        int bits;

        if (len <= 4) {
            bits = 4;
        } 
        else if (len <= 8) {
            bits = 8;
        } 
        else if (len <= 16) {
            bits = 16;
        } 
        else if (len <= 32) {
            bits = 32;
        } 
        else {
            bits = 64;
        }

        int zeros = bits - len;

        for (int i = 0; i < zeros; i++) {
            binary = "0" + binary;
        }

        System.out.println("Binary of " + num + " = " + binary + " :(" + bits + "-bits)");

        input.close();
	}
}
