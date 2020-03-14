package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."; não é possivel colocar string pq tipo do 'a' é fixo!
		
		var b = 4.5; //o java descobre o tipo de inferência
		System.out.println(b);
	
		var c = "texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);
		
		double d; //variável foi declarada
		d = 123.65; //variável foi inicializada
		System.out.println(d); //usada!
		
	}
}
