package fundamentos.desafios;

public class DesafioLogicos {

	//trabalho na terça (V ou F)
	//trabalho na quinta (V ou F)
	//se os dois trabalhos derem certos, comprar um tv de 50 pol
	//se um dos dois derem certo, comprar uma tv de 32 pol
	//se comprar uma tv(qualquer tipo) a família irá tomar sorvete no shopping
	//se nenhum trablho der certo, a família ficará em casa com fome
	//negação lógica em cima do sorvete.. ficou com fome, ou mais saudável
	
	public static void main(String[] args) {
		
	boolean trabalho1 = false;
	boolean trabalho2 = true;
	
	boolean comprouSorvete = (trabalho1 || trabalho2);
	boolean ficouComFome = (!comprouSorvete);
	boolean maisSaudavel = (!comprouSorvete);
	
	System.out.println("\nA família foi para o shopping?");
	System.out.println(trabalho1 ^ trabalho2);
	
	System.out.println("\nA família comprou uma tv de 50 polegadas? ");
	System.out.println(trabalho1 && trabalho2);
	
	System.out.println("\nA família comprou uma tv de 32 polegadas? ");
	System.out.println(trabalho1 || trabalho2);
		
	System.out.println("\nComprou sorvete? " + comprouSorvete);
	System.out.println("\nFicou com fome? " + ficouComFome);
	System.err.println("\nMais saudável? " + maisSaudavel);
	
	
	}
}
