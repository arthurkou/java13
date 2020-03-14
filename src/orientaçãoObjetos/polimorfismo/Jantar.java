package orientaçãoObjetos.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.1);
		Feijao ingrediente2 = new Feijao(0.2);
		
//		Comida ingrediente3 = new Comida(0.3); //abstract
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}
