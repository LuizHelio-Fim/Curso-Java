import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Olá, Mundo! ");
		System.out.println("Bom dia!");
		
		
		int x = 32;
		System.out.println(x);
		
		
		double y = 10.35784;
		System.out.printf("%.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y); // %.xf onde x é o numero, serve para formatar o valor float ou double e limitar as casas decimais
		
		System.out.println("RESULTADO: " + x + " METROS");
		System.out.printf("RESULTADO: %.2f metros%n", y);
		
		
		String nome = "Maria";
		byte idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		
		int num1, num2;
		num1 = 5;
		num2 = 2*num1;
		System.out.println(num1);
		System.out.println(num2);
		
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B) / 2.0 * h;
		System.out.println(area);
		
		
		int f, g;
		double resultado;
		f = 5;
		g = 2;
		
		resultado = (double) f / g; // é necessário adicionar o tipo da variavel que você quer que saia o resultado
		System.out.println(resultado);
		
		
		double i;
		int u;
		
		i = 5.0;
		u = (int) i; //casting
		
		System.out.println(u);
	}

}
