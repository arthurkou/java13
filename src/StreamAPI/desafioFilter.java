package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class desafioFilter {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		Motorista m1 = new Motorista("Fox", 120.0, "Homem");
		Motorista m2 = new Motorista("HB20", 90.0, "Mulher");
		Motorista m3 = new Motorista("Corolla", 70.0, "Mulher");
		Motorista m4 = new Motorista("Civic", 110.0, "Homem");
		Motorista m5 = new Motorista("Gol", 140.0, "Mulher");
		
		List<Motorista> multado = Arrays.asList(m1, m2, m3, m4, m5);
		
		Predicate<? super Motorista> multado1 = (m -> m.velocidade >= 100.0);
		Predicate<Motorista> sexo = (s -> s.sexo == "M");
		
		System.out.println("As pessoas multadas: ");
		
		multado.stream()
		.filter(multado1)
//		.filter(sexo)
		.map(m -> m.carro + " >>> " + m.sexo)
		.forEach(System.out::println);		
		
	}
}
