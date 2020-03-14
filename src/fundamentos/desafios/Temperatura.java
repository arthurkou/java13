package fundamentos.desafios;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		//constantes
		final double AJUSTE = -32;
		final double FATOR = 5/9.0;
		
		//variáveis
		double fahrenheit = 86;
		double celsius = (fahrenheit + AJUSTE) * FATOR;
		
		System.out.println("Convertendo a temperatura de fahrenheit para Celsius");
		System.out.println("A temperatura é: " + celsius + "°C");
		
		fahrenheit = 150;
		celsius = (fahrenheit + AJUSTE) * FATOR;
		
		System.out.println("A temperatura é: " + celsius + "°C");		
	}
}
