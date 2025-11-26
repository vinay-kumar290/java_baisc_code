package lvl_2;
import java.util.Scanner;

public class P36_ArmstrongNumBetween2Num {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a range to get armstrong numbers in between them:");

        System.out.print("Enter first nubmer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second nubmer: ");
        int num2 = input.nextInt();

        if (num1 < num2){

            System.out.println("Armstrong number between " + num1 + " and " + num2 + " are: ");

            for(int i = num1; i <= num2; i++){

                int armstrong = i;
                int result = 0;

                int digit = 0;
                int temp = i;

                while (temp > 0){
                    temp = temp / 10;
                    digit++;
                }

                temp = i;

                while (temp > 0){
                    int rem = temp % 10;
                    result = result + (int) Math.pow(rem, digit);
                    temp = temp / 10;
                }
                
                if(armstrong == result){
                    System.out.print(armstrong + ", ");
                }
            }
        }
        else{
            System.out.println("Enter correct range");
        }
        input.close();
    }
}