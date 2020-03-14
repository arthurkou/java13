package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<? super Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3 , 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = 
				texto -> new StringBuilder(texto).reverse().toString();
				
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
				
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
//		.forEach(System.out::println);
		.forEach(print);
		
//		1. número para string binária..args. 6 => "110"
//		2. INverter a String.. "110" => "011"
//		3. COnverter de volta para inteiro => "011" => 3
	}
}
