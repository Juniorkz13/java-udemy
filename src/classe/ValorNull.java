package classe;

public class ValorNull {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("! ! !"));

//		String s2; // haverá erro de compilação;
		
//		String s2 = null; // haverá erro de execução.
		
		String s2 = Math.random() > 0.5 ? "" : null; // uma forma de tratar o erro. Mostra as "? ? ?" quando não é nulo, e não mostra quando é.

		if (s2 != null) {
			System.out.println(s2.concat("? ? ?"));
		}

	}

}
