import java.util.Locale;
import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if (num2 != 0) {
				double div = (double) num1/num2;
				System.out.printf("%.1f%n", div);
			}
			else {
				System.out.println("Divisao impossivel");
			}
			
		}
		sc.close();
	}
}
