package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 7.6;
//		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
//		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
//		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
		String resultadoFinal = media >= 7.0 ? "aprovado" : media >= 5.0 ? "em recuperação" : "reprovado"; // também
																											// pode ser
																											// feito
																											// assim.

//		System.out.println("O aluno está " + resultadoParcial);
		System.out.println("O aluno está " + resultadoFinal);

		int a = 5;
		String verif = a > 7 ? "verdade" : "falso";

		System.out.println(verif);

	}

}
