package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class eCommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<? super String> print = System.out::println;

		Venda v1 = new Venda("smart phone", true, 25.00, 0.15);
		Venda v2 = new Venda("computador", true, 2500.00, 0.40);
		Venda v3 = new Venda("notebook", true, 3500.00, 0.70);
		Venda v4 = new Venda("camisa", true, 85.00, 0.25);
		Venda v5 = new Venda("calça", true, 90.00, 0.10);
		Venda v6 = new Venda("sapato", true, 110.00, 0.35);
		
		List<Venda> produtos = Arrays.asList(v1, v2, v3, v4, v5, v6);
		
		Predicate<Venda> desconto = m -> m.desconto > 0.30;
		Predicate<Venda> freteGratis = m -> m.freteGratis = true;
		
		produtos.stream()
		.filter(desconto)
		.filter(freteGratis)
		.map(m -> "produtos com 30% de desconto e frete grátis: " + m.nomeProduto)
		.forEach(print);
		
		
		
	}

}
