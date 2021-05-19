package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double total = 0, aux = 0, media = 0;
		int valido = 0, invalido = 0;

		while (aux != -1) {
			System.out.println("Serão consideradas válidas somente notas de 0 a 10. Digite -1 para sair.");
			System.out.print("Digite a nota do aluno: ");
			aux = entrada.nextDouble();
			if (aux >= 0 && aux <= 10) {
				total += aux;
				valido++;
			} else if (aux != -1) {
				System.out.println("Número inválido");
				invalido++;
			}
		}
		media = total / valido;
		System.out.printf("Foram digitados %d números válidos e %d inválidos.\nA média das notas válidas é de %.2f.",
				valido, invalido, media);

		entrada.close();

	}

}
