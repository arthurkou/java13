package orientaçãoObjetos.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa("Pedro", "Omoedo", -20);
		p1.setIdade(130);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}

}
