package lambdas.interfaceFunc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<List<String>> lista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui", "Dani");
				
				System.out.println(lista.get());
	}

}
