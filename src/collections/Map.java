package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(3));
		
		for (Integer index : usuarios.keySet()) {
			System.out.println(index);
		}
		
		for (String usuario : usuarios.values()) {
			System.out.println(usuario);
		}
		
		for (Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + ">>>>");
			System.out.println(usuario.getValue());
		}
	}

}
