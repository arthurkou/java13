package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantidade de alunos na turma: ");
		int qntdAlunos = entrada.nextInt();

		System.out.println("Quantidade de provas para cada aluno:");
		int qntdProvas = entrada.nextInt();

		double[][] notasDaTurma = new double[qntdAlunos][qntdProvas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("Informe a nota %d do aluno %d: \n", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}

			double media = total / (qntdAlunos * qntdProvas);
			System.out.println("Média da turma é: " + media);

			for (double[] notasDoAluno : notasDaTurma) {
				System.out.println(Arrays.toString(notasDoAluno));

			
		}

		entrada.close();
	}
}
