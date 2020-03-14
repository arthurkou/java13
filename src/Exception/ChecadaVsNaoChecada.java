package Exception;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception {

		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	// excessão não checada ou não verifica
	static void geraErro1() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #01!");

	}

	// excessão checada ou verificada
	static void geraErro2() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal #02!");
	}
}
