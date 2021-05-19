package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("olá pessoal".charAt(2)); // como a STRING não é um tipo primitivo, é possível chamar a
														// NOTAÇÂO PONTO.
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "???");
		System.out.println(s.startsWith("Boa")); // nem todo método de STRING irá retornar uma outra STRING, pode ser
													// funcionalidades.
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length()); // resultado foi valor inteiro.
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.endsWith("Dia"));
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println();

//		var nome = "Júnior";
//		nome.  // utilizando o VAR a NOTAÇÃO PONTO funciona normalmente.

		var nome = "Júnior";
		var sobrenome = "Kz";
		var idade = 28;
		var altura = 1.76;

		System.out.println(
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nAltura: " + altura + "\n\n");
		String frase1 = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nAltura: " + altura
				+ "\n\n"; // a concatenação foi toda armazenada em uma variável String.
		System.out.println(frase1);

		System.out.printf("O senhor %s %s tem %d anos e mede %.2fm de altura.\n", nome, sobrenome, idade, altura);
		String frase = String.format("O senhor %s %s tem %d anos e mede %.2fm de altura.\n", nome, sobrenome, idade,
				altura); // dessa forma, toda a frase foi armazenada numa variável String.
		System.out.println(frase);

		System.out.println("Frase qualquer".contains("qual")); // explore as diversas funcionalidades que existem na
																// linguagem.
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));

	}

}
