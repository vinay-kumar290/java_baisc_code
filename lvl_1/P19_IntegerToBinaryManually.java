package lvl_1;

import java.util.Scanner;

public class P19_IntegerToBinaryManually {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = input.nextInt();

        String binary = "";
        int temp = num;
        
        while(temp > 0) {
        	
        	int reminder = temp % 2;
        	binary = reminder + binary;
        	
        	temp = temp / 2;
        }
        System.out.println("Binary of " + num + " is " + binary);
        input.close();
    }
}