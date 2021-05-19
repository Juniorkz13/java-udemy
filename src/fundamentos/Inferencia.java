package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);

		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);

//		c = 4.5; // isso não irá funcionar, pois já foi definido anteriormente que a variável C é do tipo string;
		
		double d; // variável foi declarada.
		d = 123.165; // valor foi atribuído (inicializado).
		System.out.println(d); // valor impresso.
		
//		var e; // não irá funcionar, pois o VAR precisa ser declarado e inicializado na mesma linha.
//		e = 123.165;
	}

}
