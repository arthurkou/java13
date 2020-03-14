package controle.atividadesExtras;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = entrada.nextInt();

		if (valor <= 10 && valor >= 0) {
			if (valor % 2 == 0) {
				System.out.println("Valor par e entre 0 a 10!");
			} else {
				System.out.println("Valor não é par");
			}
		} else {
			System.out.println("Valor fora do limite");
		}

		entrada.close();
	}

}
