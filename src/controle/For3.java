package controle;

public class For3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

//		System.out.println(i); // não é possível acessar a variável fora do for, a não ser que a variável seja declarada antes.

		int a = 0;
		for (; a < 10; a++) {
			System.out.println("dentro do FOR -->" + a);
		}
		System.out.println();
		System.out.println("fora do FOR -->\n" + a);

		// FOR dentro de FOR

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.printf("i [%d] j [%d]\n", i, j);
			}
			System.out.println();
		}
	}
}