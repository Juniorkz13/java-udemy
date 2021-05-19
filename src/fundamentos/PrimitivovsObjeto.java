package fundamentos;

public class PrimitivovsObjeto {

	public static void main(String[] args) {
		
		String s = "Texto"; // variável s recebeu um valor, se tornando um OBJETO.
		s.toUpperCase();  // objeto s ao receber a notação ponto, possui atributos e comportamentos, como esse exemplo.
		
		int a = 123; // tipos primitivos não possuem notação ponto.
//		a.  // não gera atributos e comportamentos.
		System.out.println(a);

	}

}
