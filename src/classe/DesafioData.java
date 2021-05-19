package classe;

public class DesafioData {

	String pessoa;
	int dia;
	int mes;
	int ano;

	DesafioData(int dia, int mes, int ano) {

		this.dia = dia; // utilizando o this para não haver conflitos.
		this.mes = mes;
		this.ano = ano;

	}

	DesafioData() {
//		dia = 01;
//		mes = 01;
//		ano = 1970;

		this(1, 1, 1995);
	}

	String dataFormatada() {
		String formato = "%d/%d/%d"; // variável local, definida dentro de um método.
		return String.format(formato, dia, mes, ano);
	}

	static void teste() {
//		this.dia = 3;  // não irá funcionar pois o THIS está em um método ESTATICO que é associado à classe, já o THIS é uma das instâncias da classe.
	}
}
