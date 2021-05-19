package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o número:");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("Número par!");
		}
		if (numero % 2 == 1) {
			System.out.println("Número ímpar!");
		}
		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else { // o ELSE funciona como o IF da condição ímpar, porém não necessita de que a
					// condição seja declarada, pois ele irá executar tudo que não se encaixe nas
					// condições dos IF's anteriores.
			System.out.println("Número ímpar!");
		}

	}

}
