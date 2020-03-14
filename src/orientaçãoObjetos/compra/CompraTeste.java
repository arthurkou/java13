package orientaçãoObjetos.compra;

public class CompraTeste {

	//relação um pra muitos
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		//compra1.itens.add(new Item("bola", 2, 8.50));
		compra1.adicionarItem(new Item("bola", 2, 8.50));
		compra1.adicionarItem("raquete", 1, 450.00);
		compra1.adicionarItem(new Item("shots", 3, 35.50));
		compra1.adicionarItem("mochila", 1, 200.70);
		
		System.out.printf("Número de itens no carrinho: %d", compra1.itens.size());
		
		//relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.printf("\nO total da compra: %.2f ", total);
	}

}
