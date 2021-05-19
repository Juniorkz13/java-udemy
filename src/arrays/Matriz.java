package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos?");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = entrada.nextInt();
		
		double[][] matrizAlunos = new double [qtdAlunos] [qtdNotas];
		
		double total = 0;
		for (int a = 0; a < matrizAlunos.length; a++) {
			for (int n = 0; n < matrizAlunos[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				
				matrizAlunos[a][n] = entrada.nextDouble();
				total += matrizAlunos[a][n];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média é: " + media);

		entrada.close();
	}
}
