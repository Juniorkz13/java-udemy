package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // converte double para Double.
		conjunto.add(true); // converte boolean para Boolean.
		conjunto.add("Teste"); // String.
		conjunto.add(1); // converte int para Integer.
		conjunto.add('x'); // converte char para Character.
		conjunto.add('x'); // não altera o tamanho do conjunto, pois não aceita repetição.
		
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println(conjunto.contains("Teste"));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // pegou tudo que havia em nums e colocou em conjunto.
		conjunto.retainAll(nums); // retêm somente os valores que são iguais nos dois conjuntos.
		System.out.println(conjunto);
		conjunto.clear(); // limpa o conjunto todo.
		System.out.println(conjunto);
	}

}
