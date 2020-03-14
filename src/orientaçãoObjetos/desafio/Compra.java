package orientaçãoObjetos.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qntd) {
		this.itens.add(new Item(p, qntd));
//		item.produto = this;
	}
	
	void adicionarItem(String nome, double preco, int qntd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qntd));
	}

	double obterValorTotal() {

		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}
	
//	public String toString() {
//		return total;
//	}
}
