package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu primeiro salário: ");
		String valor1 = entrada.next().replace(",", ".");

		System.out.print("Digite o seu segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");


		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
				
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		
		//System.out.println("soma do salário = " + soma);
		System.out.println("Média do salário = " + media);
		entrada.close();

	}
}
