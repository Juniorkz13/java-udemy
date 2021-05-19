package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {

		System.out.println(2 + 3);

		var x = 34.56;
		double y = 2.2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // cast, convertendo para double.
		System.out.println(a / (float) b); // cast, convertendo para float.
		
		System.out.println(a % b); // mod, imprime o resto da divisão.
		System.out.println(8 % 3); // mod, imprime o resto da divisão.
		
		System.out.println(x + y - a * b); // multiplicação e divisão vem primeiro do que soma e subtração.

	}

}
