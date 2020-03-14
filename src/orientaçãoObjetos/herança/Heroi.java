package orientaçãoObjetos.herança;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y) {
		super(x, y); //chamar explicitamente sempre que classe pai nao tiver padrão definido
	}

	public boolean atacar(Jogador oponente) {

		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);

		return ataque1 || ataque2 || ataque3;
	}
}
