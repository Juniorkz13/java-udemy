package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	double pesoTotal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer(double pesoP, double pesoC) {
		pesoTotal = pesoP + pesoC;
	}
	

}
