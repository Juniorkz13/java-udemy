package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>(); // no mapa, por ser CHAVE - VALOR, é necessário colocar 2 tipos
		
		usuarios.put(1, "João"); // No mapa não é ADD, é PUT, isso pq o PUT substitui um valor caso ele já exista
		usuarios.put(1, "José"); // No primeiro put foi adicionado joão, e no segundo foi substituído por José
		usuarios.put(2, "Manu");
		usuarios.put(3, "Maria");
		usuarios.put(20, "Fátima");
		usuarios.put(4, "Bastião");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // retorna as CHAVES, na ordem que foram inseridas, ele não mantém ordenado
		System.out.println(usuarios.values()); // retorna os VALORES, também em ordem de inserção
		System.out.println(usuarios.entrySet()); // retorna as CHAVES - VALORES
		
		System.out.println(usuarios.containsKey(20)); // retorna se a CHAVE está contida
		System.out.println(usuarios.containsValue("José")); // retorna se o VALOR está contido
		
		System.out.println(usuarios.remove(4)); // remove o elemento
		System.out.println(usuarios.remove(3, "Maria")); // só irá remover se tanto chave quanto valor baterem
		
		System.out.println(usuarios.get(20)); // retorna o VALOR contido na CHAVE informada
		
		for (int chave : usuarios.keySet()) { // percorrendo as CHAVES
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) { // percorrendo os valores
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) { // IMPORTAR java.util.Map.Entry; Colocar os tipos e percorrer
//			System.out.println(registro);
			System.out.print(registro.getKey() + " "); // formas diferentes de obter o resultado
			System.out.println(registro.getValue());
		}

	}

}
