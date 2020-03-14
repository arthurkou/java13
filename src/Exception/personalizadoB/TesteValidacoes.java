package Exception.personalizadoB;

import StreamAPI.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}

}
