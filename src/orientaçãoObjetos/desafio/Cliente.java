package orientaçãoObjetos.desafio;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();	
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	//retorna quanto o usuário gastou
	double obterValorTotal() {
		
		 double totalCompra = 0;
		
		for (Compra compra : compras) {
			totalCompra += compra.obterValorTotal();
		}
		return totalCompra;
	}
}
