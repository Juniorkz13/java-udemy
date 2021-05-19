package fundamentos;

import javax.swing.JOptionPane;

public class ExercicioAreaTriangulo {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Para calcular a área de um triângulo insira os valores requisitados.");
		String entrada1 = JOptionPane.showInputDialog("Insira o valor da base do triângulo:");
		String entrada2 = JOptionPane.showInputDialog("Insira o valor da altura do triângulo:");

		String valor1 = entrada1.replace(",", ".");
		String valor2 = entrada2.replace(",", ".");

		Double base = Double.parseDouble(valor1);
		Double altura = Double.parseDouble(valor2);

		double area = (base * altura) / 2;

		JOptionPane.showMessageDialog(null, String.format("A área do triângulo é igual a %.2f.", area));

	}

}
