package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> print = System.out::println;

		Aluno a1 = new Aluno("Ana", 7.8, true);
		Aluno a2 = new Aluno("Bia", 5.8, false);
		Aluno a3 = new Aluno("Daniel", 9.8, false);
		Aluno a4 = new Aluno("Gui", 6.8, true);
		Aluno a5 = new Aluno("Rebeca", 7.1, true);
		Aluno a6 = new Aluno("Pedro", 8.8, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		alunos.stream()
		.filter(aprovado)
		.filter(m -> m.bomComportamento == true)
		.map(a -> "Parabéns, " + a.nome + "! Você for aprovado!")
		.forEach(print);
	}
}
