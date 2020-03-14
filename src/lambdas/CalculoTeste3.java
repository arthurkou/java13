package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calc = (n1, n2) -> {return n1 + n2; };		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (n1, n2) -> n1 * n2;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (n1, n2) -> {return n1 + n2; };		
		System.out.println(calc2.apply(2, 3));
		
		calc = (n1, n2) -> n1 * n2;
		System.out.println(calc2.apply(2, 3));

//		System.out.println(calc.apply());
//		System.out.println(Calculo.muitoLegal());
	}

}
