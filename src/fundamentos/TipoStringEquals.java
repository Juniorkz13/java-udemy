package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s); // não consegue comparar.
		System.out.println("2".equals(s)); // consegue comparar.

		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // função trim retira os espaços em branco do que for digitado. Aqui a
												// comparação não funciona.
		System.out.println("2".equals(s2.trim())); // aqui a comparação funciona mesmo que vários espaços em branco
													// sejam digitados.

		entrada.close();

	}

}
