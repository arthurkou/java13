package fundamentos;

public class AreaCircunferencia {
	
	//variaveis e constantes
	public static void main(String[] args) {
		double raio = 3.4;
		//final => define que o valor não poderá ser mudado
		//boas práticas: constante com letras maiúsculas
		final double PI = 3.1415;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2");
	}

}
