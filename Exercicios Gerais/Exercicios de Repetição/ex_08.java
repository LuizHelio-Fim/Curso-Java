import java.util.Locale;
import java.util.Scanner;

public class ex_08 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fat = 1;
		
		for (int i=1; i<=N; i++) {
			
			fat *= i;
		}
		
		 if (N == 0) {
			 System.out.println("1");
		 }
		 else {
			 System.out.println(fat);
		 }
		
		sc.close();
	}
}