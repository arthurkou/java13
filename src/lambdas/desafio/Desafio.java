package lambdas.desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.interfaceFunc.Produto;

public class Desafio {

	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);					

		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> frete = preco -> preco >= 300 ? 100.0 + preco : 50 + preco;
		
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("Ipad", 3235.89 , 0.50);
		String preco = precoFinal
				.andThen(imposto)
				.andThen(frete)
//				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
//		System.out.println(Double.parseDouble(preco));
		System.out.println(preco);
//		System.out.printf(Math.round(preco));

//		1. A partir do produto calcular o preço real (com desconto)
//		2. Imposto municipal: >= 2500 (8,5%)/ < 2500 (isento)
//		3. Frete: >= 3000 (100)/ < 3000 (50)
//		4. Arredondar: Deixar duas casas decimais
//		5. Formatar: R$1234,56
	}

}
