package controle.atividadesExtras;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = nota1 + nota2 / 2;
		System.out.println("Média: " + media);
		
		if (media > 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Rescuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
