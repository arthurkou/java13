package StreamAPI;

public class Venda {

	public String nomeProduto;
	public boolean freteGratis;
	public double preco;
	public double desconto;

	public Venda(String nomeProduto, boolean freteGratis, double preco, double desconto) {
		this.nomeProduto = nomeProduto;
		this.freteGratis = freteGratis;
		this.preco = preco;
		this.desconto = desconto;
	}
	
//	public String toString() {
//		return "produtos: " + nomeProduto;
//	}
}
