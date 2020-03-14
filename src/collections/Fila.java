package collections;

import java.util.LinkedList;
import java.util.Queue;

//first in first out
public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
//		offer e add -> adicionam elementos na fila
//		diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana");//retorna false
		fila.offer("Bia");//retorna excessão
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
//		peek e element -> obtem o próximo elemento da fila(sem remover)
//		diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());// retorna nulo
		System.out.println(fila.element());// lança excessão
		System.out.println(fila.element());
		
		
//		Poll e remove -> obter o próximo elemento da fila e remove
//		diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll()); 
		System.out.println(fila.poll());//retorna nulo
		System.out.println(fila.remove());// retorna uma excessão
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains();
		
	}

}
