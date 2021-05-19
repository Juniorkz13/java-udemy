package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook"); // Objeto criado.
									// O molde CLASSE criou dois produtos "iguais" mas que irão receber valores
									// diferentes.
		var p2 = new Produto("Caneta Preta"); // Objeto criado. Com a utilização do new Produto(); a linguagem aceita a
								// utlização do VAR.

		// O construtor do objeto recebeu um parâmetro de forma explícita, nesse caso é
		// preciso declarar um parâmetro para criar o objeto. ex: new Produto("Notebook");

//		p1.nome = "Notebook"; // Características ou valores do OBJETO sendo atribuídas.
		p1.preco = 4356.99; // Características ou valores do OBJETO sendo atribuídas.
//		p1.desconto = 0.25; // Características ou valores do OBJETO sendo atribuídas.

//		p2.nome = "Caneta Preta"; // Características ou valores do OBJETO sendo atribuídas.
		p2.preco = 12.99; // Características ou valores do OBJETO sendo atribuídas.
//		p2.desconto = 0.10; // Características ou valores do OBJETO sendo atribuídas.

		System.out.println(p1.nome);
		System.out.println(p2.nome);

//		double precoFinal1 = p1.preco * (1- p1.desconto);
//		double precoFinal2 = p2.preco * (1- p2.desconto);

		double precoFinal1 = p1.precoComDesconto(0.1); // Para não ser necessário repetir as operações acima toda vez
														// que
														// desejo calcular o desconto, utiliza-se o método. Nos casos, o
														// valor entre parênteses corresponde ao valor do novo parâmetro
														// criado no método.
		double precoFinal2 = p2.precoComDesconto();

		System.out.printf("Preço final do %s: R$%.2f.\nPreço final da %s: R$%.2f.", p1.nome, precoFinal1, p2.nome,
				precoFinal2);

	}

}
