package orientaçãoObjetos.herança.teste;

import orientaçãoObjetos.herança.desafio.Carro;
import orientaçãoObjetos.herança.desafio.Civic;
import orientaçãoObjetos.herança.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ferrari c1 = new Ferrari(400);		
		
		c1.ligarTurbo();
		c1.ligarAr();
		c1.desligarAr();
		
		c1.acelerar();
		c1.frear();
		System.out.println(c1);
		
		c1.acelerar();
		c1.frear();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		Carro c2 = new Civic(100);
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
				
	}

}
