package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {

		DesafioData data1 = new DesafioData(31, 03, 1992);
		DesafioData data2 = new DesafioData(16, 05, 1955);
		DesafioData data3 = new DesafioData();

		data1.pessoa = "Júnior";
		data2.pessoa = "Fátima";

		String dataFormatada1 = data1.dataFormatada();
		String dataFormatada2 = data2.dataFormatada();
		String dataFormatada3 = data3.dataFormatada();

		System.out.printf("%s, nascido em: %s.\n%s, nascida em: %s.\n", data1.pessoa, dataFormatada1, data2.pessoa,
				dataFormatada2);
		System.out.printf("Data padrão: %s.", dataFormatada3);
	}

}
