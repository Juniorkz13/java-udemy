package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) { // utilzando dessa maneira, é possível colocar o nome para cada laço.
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo; // aqui fica demonstrando qual laço eu desejo finalizar.
				}
				System.out.printf(" i = %d  j = %d ", i, j);
			}
			System.out.println();
		}
		System.out.println("fim");
	}

}
