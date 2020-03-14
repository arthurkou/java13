package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<String> listaAprovados = new HashSet<>(); fora da ordem
		SortedSet<String> listaAprovados = new TreeSet<>();//ordenação
		listaAprovados.add("ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(200);
		nums.add(120);
		nums.add(4);
		
		for (int n : nums) {
			System.out.println(n);
		}
		
		
	}

}
