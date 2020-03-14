package fundamentos.conversao;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = Integer.parseInt(entrada.next()); //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());//tranforma short em string
		System.out.println(i * 3);
		System.out.println(l / 3);

		float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //transforma string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());//transforma boolean em string e upperCase
		
		Character c = '#';
		System.out.println(c + "...");
		
		
		//entrada.close();

	}

}
