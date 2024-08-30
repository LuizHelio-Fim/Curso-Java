package Application;

import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
				
		System.out.print("\nHow many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.printf("%nAmount to be paid in REAIS = %.2f", CurrencyConverter.converter());
		
		sc.close();

	}

}
