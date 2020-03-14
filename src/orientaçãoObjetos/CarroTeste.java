package orientaçãoObjetos;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro c1 = new Carro();
		System.out.printf("Ligado? %b ", c1.estaLigado());
		
		c1.ligar();
		System.out.printf("\nLigado? %b", c1.estaLigado());
		
		System.out.println();
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();		
		
		//faltou encapsulamento
		//c1.motor.fatorInjecao = - 30;

		System.out.println(c1.motor.giros());
		
		//relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());	
		
	}

}
