package Exception;

import StreamAPI.Aluno;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
			//nullpointerexception nao tem mensagem
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento " 
		+ "de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
//			e.printStackTrace(); // em que ponto da pilha a excessão foi gerada
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim: ");
	}
	
	 public static void imprimirNomeDoAluno(Aluno aluno) {
		 System.out.println(aluno.nome);
	 }
}
