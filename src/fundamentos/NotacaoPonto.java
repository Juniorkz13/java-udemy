package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X"; // é possível atribuir funções individualmente em cada linha, ou em sequencia
								// numa linha só, como abaixo. (linha 17).
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);
		System.out.println("Júnior".toUpperCase()); // mesmo não havendo definido o dado, é possível utilizar a NOTAÇÃO
													// PONTO para atribuir funcionalidades.

		String y = "Bom dia X".replace("X", "Júnior").toUpperCase().concat("!!!"); // as concatenações de funções também
																					// podem ser difinidas na mesma
																					// linha, em sequência, desde que
																					// todas elas sejam do mesmo tipo,
																					// no caso STRING, diferente do
																					// inicio, onde cada uma foi
																					// definida individualmente.
		System.out.println(y);
		
		// tipos primitivos não possuem a NOTAÇÃO PONTO!!!
//		int a = 3;
//		a.        // não irá atribuir nenhuma função.
	}

}
