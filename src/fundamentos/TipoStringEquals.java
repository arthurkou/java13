package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2" == s1);//deu diferente pq deve ser usado o método equals para comparar string
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next(); //nextline já tira os espaços em branco e nao precisa do trim
		System.out.println("2" == s2.trim()); //trim tira os espaços em branco
		System.out.println("2".equals(s2));
		
		entrada.close();
	}
}
