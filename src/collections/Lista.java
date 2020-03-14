package collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lista
//		pode ser homogêneo ou heterogêneo
//		aceita obj duplicados
//		é ordenado
//		é indexado

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3).nome);
//		System.out.println(lista.get(3));

		System.out.println(">>>>>" + lista.remove(3));

		System.out.println(lista.remove(new Usuario("Manu")));

		System.out.println("tem: " + lista.contains(new Usuario("Carlos")));
		System.out.println("tem: " + lista.contains(u1));// tem a referência do objeto

		System.out.println();

		for (Usuario u : lista) {
//			System.out.println(u.nome);
			System.out.println(u); // toString
		}
	}

}
