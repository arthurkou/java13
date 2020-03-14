package StreamAPI;

public class Motorista {

	public String carro;
	public double velocidade;
	public boolean multado;
	public String sexo;

	public Motorista(String carro, double velocidade, String sexo) {
		this.carro = carro;
		this.velocidade = velocidade;
		this.sexo = sexo;
	}
	
	public String toString() {
		return "os carros multadas são: " + carro;
	}

}
