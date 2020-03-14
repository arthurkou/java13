package controle.desafios;

import java.util.Scanner;

public class DesafioSair {
	
	public static void main(String[] args) {
		
		//while indeterminado
		String palavra = "";
		
		Scanner entrada = new Scanner(System.in);
				
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.println("conversa comigo;");
			palavra = entrada.nextLine();	
		}
		
		entrada.close();
		
	}
	
	
	
}
