import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gas = 0, diesel = 0, escolha;
		
		System.out.printf("TABELA: %n"
				+ "1 - Alcool%n"
				+ "2 - Gasolina%n"
				+ "3 - Diesel%n%n");
		
		while (true) {
			
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gas += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				System.out.println("Valor invalido, Digite novamente!");
				break;
			}
			if (escolha == 4) {
				break;
			}
			
		}
		System.out.printf("MUITO OBRIGADO%n"
				+ "Alcool: %d%n"
				+ "Gasolina: %d%n"
				+ "Diesel: %d", alcool, gas, diesel);
		
		sc.close();
	}
}
