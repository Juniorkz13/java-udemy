package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número para saber suas características:");
		int num = entrada.nextInt();

		if (num % 2 == 0 && num >= 0 && num <= 10) {
			System.out.printf("O número %d está entre 0 e 10, e é par!", num);
		} else
			System.out.println("Número não se encaixa nas regras.");

		entrada.close();

	}

}
