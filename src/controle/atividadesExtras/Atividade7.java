package controle.atividadesExtras;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {

		double numero = 0;
		double somarnumeros = 0;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("digite um número: ");

			numero = entrada.nextDouble();

			double r = somarnumeros += numero;
			System.out.println("Acumulado: " + r);
			
		} while (numero % 2 == 0);
		
		entrada.close();
		System.out.println("Fim");
	}

}

/*
 * double numero = 0; double somarnumeros = 0;
 * 
 * Scanner entrada = new Scanner(System.in);
 * 
 * while (numero % 2 == 0) {
 * 
 * System.out.println("digite um número: ");
 * 
 * numero = entrada.nextDouble();
 * 
 * double r = somarnumeros += numero; System.out.println("Acumulado: " + r); }
 * entrada.close(); System.out.println("Fim"); }
 */