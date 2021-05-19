package fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
//		Integer i = Integer.parseInt(entrada.next()); // Recebendo o valor via String, porém com cálculo na impressão
														// que prova ser um valor inteiro.
		Integer i = Integer.parseInt("10000"); // o valor do INT i está sendo atribuído como uma String.
//		Integer i = 10000; // tipo int.
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString()); // o valor impresso na tela foi igual ao valor atribuído ao short, porém foi
											// impresso como String.
		System.out.println(i * 3); // impressão com cálculo que prova que o valor INT capturado no Scanner de
									// String é realmente inteiro.
		System.out.println(l / 3);

//		entrada.close();
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 12345.678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // valor STRING transformado em BOOLEAN.
		System.out.println(bo);
//		System.out.println(bo.toUpperCase()); // não é possível transformar valor booleano em upper case, porém a prova que é possível manipular na próxima impressão.
		System.out.println(bo.toString().toUpperCase()); // valor booleano transformado em String e agora sim em upper case.
		
		Character c = '#';  // correspondente ao CHAR.
		System.out.println(c.toString()); // CHAR transformado em STRING.
		
		
	}

}
