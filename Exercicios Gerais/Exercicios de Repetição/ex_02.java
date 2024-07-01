import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = 1, y = 1;
		
		while (x != 0 && y != 0) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
		}
		scan.close();
	}
}
