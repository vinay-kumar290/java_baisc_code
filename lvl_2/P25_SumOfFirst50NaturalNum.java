package lvl_2;

public class P25_SumOfFirst50NaturalNum {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			
			sum = sum + i;
		}
		System.out.println("Sum of first 50 natural num. is: " + sum);
	}
}