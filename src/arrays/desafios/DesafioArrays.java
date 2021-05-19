package arrays.desafios;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite quantas notas quer informar: ");
		int indice = entrada.nextInt();

		double[] notas = new double[indice];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i+1) + ":");
			notas[i] = entrada.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;

		System.out.println("A média das notas é: " + media);

		entrada.close();

	}

}
