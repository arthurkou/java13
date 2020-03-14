package fundamentos.desafios;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int a = 3 + 2 * 6;
		double b = Math.pow(a, 2);
		double c = b / 3 * 2;
		
		//System.out.println(c);
		
		int x = (1-5)*(2-7)/2;
		double y = Math.pow(x, 2);
		
		//System.out.println(y);
		
		double h = (c - y);
		double u = Math.pow(h, 3);
		double o = u / 1000;
				
		System.out.println(o);
	}
}
