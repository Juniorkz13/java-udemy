package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// Sem o BREAK, quando um case for ativado, todos os outros abaixo dele também serão executados.
		// Switch não são casos booleanos de verdadeiro ou falso, ele faz comparações de valor.
		
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei tudo...");
		case "marrom":
			System.out.println("Sei quase tudo...");
		case "roxa":
			System.out.println("Quase lá...");
		case "amarela":
			System.out.println("Aprendendo...");
		default:
			System.out.println("Fiz a matrícula...");
		}
	}
}
