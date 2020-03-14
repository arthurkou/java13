package orientaçãoObjetos.compra;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//substitui o add na CompraTeste
	//add o item na lista de itens e seta this item como a compra
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	//já instancia o objeto dentro do método
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item (nome, quantidade, preco));
//		this.itens.add(new Item(nome, quantidade, preco));
	}

	double obterValorTotal() {
		
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
				
		return total;
	}
}
