package classe.desafios.controlePeso;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comida c1 = new Comida();
		c1.nomeComida = "Arroz";
		c1.pesoComida = 0.35;
		
		Comida c2 = new Comida();
		c2.nomeComida = "feijão";
		c2.pesoComida = 0.45;
		
		Pessoa p = new Pessoa("Bruno", 89);
//		p.nome = "Bruno";
//		p.peso = 89;
		
		p.comer(c2.nomeComida, c2.pesoComida);		

	}

}
