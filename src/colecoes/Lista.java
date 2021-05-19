package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>(); // pode usar somente List<Usuario> lista = new ArrayList<>():

		Usuario u1 = new Usuario("Ana"); // forma de add.
		lista.add(u1);
		lista.add(new Usuario("José")); // forma mais simples de add.
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Amanda"));
		lista.add(new Usuario("Fátima"));
		lista.add(new Usuario("Maria"));

		System.out.println(lista.get(3)); // Acessando pelo índice. Está usando o método toString criado no objeto
											// Usuario.

		lista.remove(2); // removendo pelo índice.
		System.out.println("Imprime qual usuário foi removido >>> " + lista.remove(0)); // removendo e mostrando qual usuário foi removido (ainda utilizando o método toString).
		System.out.println(lista.remove(new Usuario("Manu"))); // retorna false, pois não existe este usuário na lista.
		System.out.println(lista.remove(new Usuario("Maria"))); // retorna true, pois removeu pelo objeto.
		System.out.println("Verificando se este usuário está na lista >>> " + lista.contains(new Usuario("Fátima"))); // verificando se o elemento está na lista.
		

		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);

		}

	}

}
