package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// informações do funcionário.

		// tipos numéricos inteiros.

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // é possível utilizar underline _ para facilitar a visualização do número. OBS: valor do tipo LONG precisa da letra L ao final.
		
		// tipos numéricos reais. (ponto flutuante).
		
		float salario = 11_445.44F; // valor do tipo FLOAT precisa da letra F ao final.
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano.
		
		boolean ferias = false; // recebe TRUE ou FALSE somente, nenhum outro valor é possível.
		
		// tipo caractere.
		
		char status = 'A'; // pode receber qualquer letra, simbolo, número, desde que esteja dentro de aspas simples.
		char status1 = '&'; // pode receber qualquer letra, simbolo, número, desde que esteja dentro de aspas simples.
		char status2 = '5'; // pode receber qualquer letra, simbolo, número, desde que esteja dentro de aspas simples.
		
		// dias de empresa.
		System.out.println(anosDeEmpresa * 365);
		// número de viagens.
		System.out.println(numeroDeVoos / 2);
		// pontos por real.
		System.out.println(pontosAcumulados / vendasAcumuladas);
		// salario.
		System.out.println(id + ": ganha --> " + salario);
		// férias.
		System.out.println("Férias? " + ferias);
		// status
		System.out.println("primeiro: " + status + " segundo: " + status1 + " terceito: " + status2);
		
		

	}

}
