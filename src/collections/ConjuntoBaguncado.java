package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);// double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');//não aceita repetição
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove(1));
		System.out.println(conjunto.remove("nada"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains("Teste"));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.add(1);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//unindo conjunto com nums
		conjunto.retainAll(nums);//pega o valor em comum
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
