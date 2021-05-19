package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		int x = 3 * 4 - 10;
		int y = (int) Math.pow(x, 3); // analisando o CTRL + espaço, mostra que elevar o número retorna um valor em
										// DOUBLE, porém pode ser feito cast.
		double z = Math.pow(x, 3);
		
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("\nInicio do desafio, a resposta está abaixo.");
		
		int a = (3+2) * 6;
		int b = (int) Math.pow(a, 2); // poderia ser escrito em uma única linha Math.pow(6 * (3 + 2), 2).
		int c = b / (3*2);
		int termoA = c;
		System.out.println(termoA);
		int a1 = (1-5) * (2-7) / 2;
		int b1 = (int) Math.pow(a1, 2);
		int termoB = b1;
		System.out.println(termoB);
		int termoC = termoA - termoB;
		System.out.println(termoC);
		int termoD = (int) Math.pow(termoC, 3);
		System.out.println(termoD);
		int termoE = (int) Math.pow(10, 3);
		System.out.println(termoE);
		int somaFinal = termoD / termoE;
		
		System.out.println("O valor final é igual a: " + somaFinal);
	}

}
