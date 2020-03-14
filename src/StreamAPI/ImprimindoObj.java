package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObj {

	public static void main(String[] args) {
		
		System.out.println("\nUsando for...");

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana");

		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));

		}
		System.out.println("\nUsando foreach...");

		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println();

		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nUsando stream...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
	}
}
