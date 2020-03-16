package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double total = 0;
		int nota = 0;
		int quantidadeNotas = 0;
		
		while (nota != -1) {
			System.out.println("Nota: ");
			nota = entrada.nextInt();		
			
			total += nota;		
			quantidadeNotas++;
		}
		
		double media = total/quantidadeNotas;
		System.out.println("Resultado: " + media);
		
		entrada.close();
	}
}
