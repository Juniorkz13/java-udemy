package controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Entre com a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.printf("Aprovado com nota final: %.2f.", media);
		} else if (media < 7.0 && media >= 4.0) {
			System.out.printf("Recuperação com nota: %.2f.", media);
		} else {
			System.out.printf("Reprovado com nota final: %.2f.", media);
		}

		entrada.close();
	}

}
