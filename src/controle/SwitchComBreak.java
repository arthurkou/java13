package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);		
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";	
			break;
		default:
			conceito = "não encontrado!";
			break;
		}
		
		System.out.println("Conceito é " + conceito);
		entrada.close();
	}

}
