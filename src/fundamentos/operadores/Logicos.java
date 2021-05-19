package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // E - AND.
		System.out.println(condicao1 || condicao2); // OU - OR.
		System.out.println(condicao1 ^ condicao2); // OU EXCLUSIVO - XOR.
		System.out.println(!condicao1); // negação.
		System.out.println(!condicao2); 
		

	}

}
