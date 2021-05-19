package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {

	public static void main(String[] args) {

		double C;
		final double ajuste = 32, fator = 5 / 9.0; // para divisões é necessário colocar o .0, pois o java não calcula
													// colocando somente inteiro.

		System.out.println("Insira a temperatura em °F: ");

		Scanner valor = new Scanner(System.in);
		double F = valor.nextDouble();

		C = (F - ajuste) * fator;

		System.out.printf("A temperatura em °C é: %.1f°C.", C);

		valor.close();

	}

}
