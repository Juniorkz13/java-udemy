package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		System.out.println(num1.toString()); // conversão de número para String. Sendo possível agora utilizar todas as funções pertencentes a String.
		System.out.println(num1.toString().length()); // saber a quantidade de caracteres.
//		System.out.println(num1.length()); // saber a quantidade de caracteres. Não funciona enquanto não transformar em String.
		
		int num2 = 20000;
		System.out.println(Integer.toString(num2)); // também é possível fazer a conversão direto no comando de saída.
		System.out.println(Integer.toString(num2).length()); // também é possível fazer a conversão direto no comando de saída.

	}

}
