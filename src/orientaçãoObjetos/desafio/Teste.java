package orientaçãoObjetos.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("Notebook", 1897.54, 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem("Impressora", 998.43, 1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
