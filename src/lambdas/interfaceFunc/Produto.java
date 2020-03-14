package lambdas.interfaceFunc;

public class Produto {

	final String nome;
	public final double preco;
	public final double desconto;

	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	
	public double getPreco() {
		return preco;
	}


	public double getDesconto() {
		return desconto;
	}


	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal;
	}
}
