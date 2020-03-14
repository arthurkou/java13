package controle.atividadesExtras;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("primeira nota:");
		System.out.println("segunda nota:");
		
		double nota1 = entrada.nextInt();
		double nota2 = entrada.nextInt();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println((double)media);
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media > 4 && media < 7) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
