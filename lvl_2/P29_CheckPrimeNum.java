package lvl_2;
import java.util.Scanner;

public class P29_CheckPrimeNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Numbner " + num + " is a prime.");
        } else {
            System.out.println("Numbner \'" + num + "\' is not a prime.");
        }
        input.close();
    }
}
//2, 3, 5, 7, 11, 13, 17, 19,...