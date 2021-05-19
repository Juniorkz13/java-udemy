package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // conversão implicita, sem problema algum.
		System.out.println(a); // impressão 1.0.

//		float b = 1.0F;  // para tornal um literal FLOAT a letra F teria quer ser adicionado ao final do número. 1.0F.
		float b = (float) 1.12345678; // conversão explicita, estou indicando antes do número que ele será um FLOAT.
		System.out.println(b); // neste caso não houve perda de informação, pois o número caberia em um FLOAT.
		float b1 = (float) 1.123456789; // neste caso houve perda de informação, pois o valor não cabe em um FLOAT,
										// deveria ter sido usado um DOUBLE.
		System.out.println(b1);

		int c = 4;
//		byte d = c;  // embora o 4 caiba dentro de um BYTE, o java não analisa os valores, mas o tipo, e um INT não cabe dentro de um BYTE.
		byte d = (byte) c;
		System.out.println(d); // não houve perda de informação, pelo valor.
		int c1 = 128;
		byte d1 = (byte) c1;
		System.out.println(d1); // houve perda de informação. Gerando valores bastante estranhos.
								// conversão explicita (CAST).

	}

}
