package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){ // Desta forma, explícita, não é mais possível criar um objeto na classe principal sem declarar um parâmetro
		nome = nomeInicial;
		
	}
	
	Produto(){ // Colocando de forma explícita o construtor padrão, ele volta a receber o objeto sem declarar parâmetros
		
	}

//	public double precoComDesconto(double preco, double desconto) {  // Os parâmetros não são declarados no método, pois já foram declarados na classe (objeto).
	public double precoComDesconto(double descontoDoGerente) { // aqui foi adcionado um novo parâmetro não previsto no
																// objeto.

		return preco * (1 - (desconto + descontoDoGerente));
	}

	public double precoComDesconto() { // como os parâmetros são diferentes, é possível ter métodos com o mesmo nome.
		return preco * (1 - desconto);
	}
}
