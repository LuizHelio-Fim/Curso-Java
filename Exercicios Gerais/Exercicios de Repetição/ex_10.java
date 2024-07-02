import java.util.Scanner;

public class ex_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int segundo = (int) Math.pow(i, 2);
			int terceiro = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
		}
		
		sc.close();
	}
}