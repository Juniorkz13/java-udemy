package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String saida = "";

		while (!saida.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma palavra, caso deseje sair, digite \"sair\":");
			saida = entrada.nextLine().toLowerCase();
			System.out.println("Você digitou: " + saida);
		}
		entrada.close();
	}

}
