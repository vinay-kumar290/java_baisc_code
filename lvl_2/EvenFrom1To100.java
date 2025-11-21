package lvl_2;

public class EvenFrom1To100 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				
				System.out.print(i + ", ");
			}
		}
	}
}