package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("José"));
		
		boolean resultado = usuarios.contains(new Usuario("José"));
		System.out.println(resultado);

	}

}
