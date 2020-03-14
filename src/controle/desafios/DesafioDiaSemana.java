package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana");
		String dia = entrada.next();

		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (dia.equals("Segunda feira")) {
			System.out.println("2");
		} else if (dia.equals("Terça feira")) {
			System.out.println("3");
		} else if (dia.equals("Quarta feira")) {
			System.out.println("4");
		} else if (dia.equals("Quinta feira")) {
			System.out.println("5");
		} else if (dia.equals("Sexta feira")) {
			System.out.println("6");
		} else if ("Sábado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}

		entrada.close();
	}
}
