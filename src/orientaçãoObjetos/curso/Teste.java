package orientaçãoObjetos.curso;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso3);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matrículado no curso de " + curso1.nome);
			System.out.println("O meu nome é: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		System.out.println(curso2.alunos.get(2).cursos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
