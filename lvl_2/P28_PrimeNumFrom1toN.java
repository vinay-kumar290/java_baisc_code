package lvl_2;
import java.util.Scanner;

public class P28_PrimeNumFrom1toN {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = input.nextInt();
        System.out.print("Prime numbers from 1 to " + num + " are: ");

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
        input.close();
    }
}