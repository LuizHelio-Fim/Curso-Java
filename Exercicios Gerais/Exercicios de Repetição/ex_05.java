import java.util.Scanner;

public class ex_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas vezes quer repetir? ");
		int resp = sc.nextInt();
		int countIn = 0, countOut = 0;
		
		for (int i=0; i<resp; i++) {
			int valor = sc.nextInt();
			
			if (valor >= 10 && valor <=20) {
				countIn += 1;
			}
			else {
				countOut += 1;
			}
		}
		System.out.println(countIn + " in");
		System.out.println(countOut + " out");
		sc.close();
	}
}
