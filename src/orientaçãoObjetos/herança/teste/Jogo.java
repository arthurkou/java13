package orientaçãoObjetos.herança.teste;

import orientaçãoObjetos.herança.Direcao;
import orientaçãoObjetos.herança.Heroi;
import orientaçãoObjetos.herança.Jogador;
import orientaçãoObjetos.herança.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		Jogador heroi = new Heroi(10, 11);
		
		System.out.println("Monstro tem: " + monstro.vida + " vidas");
		System.out.println("Herói tem: " + heroi.vida + " vidas");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem: " + monstro.vida + " vidas");
		System.out.println("Herói tem: " + heroi.vida + " vidas");
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.OESTE);
		
	}

}
