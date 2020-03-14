package orientaçãoObjetos.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobreNome;

	public Pessoa(String nome, String sobreNome, int idade) {
		setIdade(idade);
		setSobreNome(sobreNome);
		setNome(nome);
//		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); // transforma neg em positivo
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos";
	}
}
