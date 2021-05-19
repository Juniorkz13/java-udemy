package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // caso uma fila tenha tamanho fixo, ao tentar adicionar um elemento a mais, retornará erro.
		fila.offer("Bia"); // utilizando o offer, o tamanho fixo não retornará erro, retornará falso.
		fila.offer("João");
		fila.offer("Maria");
		fila.offer("Manu");
		fila.offer("José");
		
		System.out.println(fila.peek()); // retorna o primeiro elemento da fila. << caso a fila esteja vazia, retorna NULL
		System.out.println(fila.element()); // retorna o primeiro elemento da fila. << caso a fila esteja vazia, retorna ERRO
		
//		fila.size(); // tamanho da fila
//		fila.clear(); // limpa a fila
//		fila.isEmpty(); // retorna se a fila está vazia ou não
		
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila, e também o remove. Caso esteja vazia, o resultado é NULL
		System.out.println(fila.remove()); // remove o primeiro elemento, caso esteja vazia, retorna erro
		
//		fila.contains(algum elemento); // para saber se determinado elemento está na fila
		
		
		
		

	}

}
