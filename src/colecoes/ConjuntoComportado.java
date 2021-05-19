package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> listaAprovados = new HashSet<>(); // dentro do <> está definido o tipo de dado que será inserido na
		// lista. Não aceitará tipo diferente.

		Set<String> listaAprovados = new TreeSet<>(); // ordenou alfabeticamente.
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("José");
		listaAprovados.add("Amanda");

		for (String cadidato : listaAprovados) {
			System.out.println(cadidato);
		}

//		Set<int> nums = new HashSet<>(); // não aceita tipo primitivo.
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(8);

		for (Integer n : nums) {
			System.out.println(n);

		}

	}

}
