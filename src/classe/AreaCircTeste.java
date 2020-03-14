package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 100000;//static
			
		//AreaCirc.PI = 3.14159;// final		
		
		System.out.println(a1.area());//area pertence a instancia
		
		System.out.println(AreaCirc.area(100));//area pertence a classe
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
