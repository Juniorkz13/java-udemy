package classe.desafio;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Comida c1 = new Comida();

		System.out.println("Insira o nome da pessoa: ");
		p1.setNome(entrada.nextLine());
		System.out.println("Insira o peso da pessoa (em kgs): ");
		p1.setPeso(entrada.nextDouble());
		System.out.println("Insira o nome da comida: ");
		c1.setNome(entrada1.nextLine());
		System.out.println("Insira o peso da comida (em kgs): ");
		c1.setPeso(entrada1.nextDouble());
		System.out.printf("%s, pesando %.2fkg, comeu %s, pesando %.2fkg.", p1.getNome(), p1.getPeso(), c1.getNome(), c1.getPeso());
		p1.comer(p1.getPeso(), c1.getPeso());
		System.out.printf("%n%s, após comer %s, ficou com o peso total de %.2fkg.", p1.getNome(), c1.getNome(), p1.pesoTotal);
		entrada.close();
		entrada1.close();
	}
}
