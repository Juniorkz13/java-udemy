package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia\n\n");

		System.out.println("Bom");
		System.out.println("dia\n\n");

		System.out.printf("Megasena: %d %d %d %d %d %n%n", 1, 2, 3, 4, 5);
		System.out.printf("Altura: %.2fm \n\n", 1.7654);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.println("\nDigite a sua idade: ");
		int idade = entrada.nextInt(); // sempre usar o next seguido do tipo de dado que irá receber.

		// System.out.println("\nNome completo: " + nome + " " + sobrenome);

		System.out.printf("O senhor %s %s possui %d anos. %n", nome, sobrenome, idade);

		entrada.close(); // para fechar o Scanner e economizar memória.

	}

}
