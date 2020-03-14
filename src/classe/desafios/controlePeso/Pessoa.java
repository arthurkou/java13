package classe.desafios.controlePeso;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(String nomeComida, double pesoComida) {

		double pesoAlimentado = peso + pesoComida;
		

		if (nomeComida != null) {
			System.out.printf("Seu peso anterior era: %.2f ", this.peso);
			System.out.printf("\nSeu peso atual após comer %s: %.2f ", nomeComida, pesoAlimentado);
		} else {
			System.out.printf("Seu peso atual: %.2f ", this.peso);
		}

	}
}
