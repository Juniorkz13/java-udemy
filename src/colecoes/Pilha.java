package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// Os métodos funcionam iguais aos da fila
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop()); // retorna erro quando não há mais elementos na pilha
		
//		livros.size();
//		livros.clear();
//		livros.contains(livros);
//		livros.isEmpty();

	}

}
