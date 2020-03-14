package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map implements Utilitarios{
	
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		marcas.stream().map(m -> m.charAt(0));
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!";
		
		String resultado = 
				Utilitarios.maiuscula
				.andThen(Utilitarios.primeiraLetra)
				.andThen(Utilitarios::grito).apply("Honda");
		System.out.println(resultado);
		
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
	}

}
