package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String operador = JOptionPane.showInputDialog("Digite a operação desejada (+, -, *, /):");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		valor1 = valor1.replace(",", ".");
		valor2 = valor2.replace(",", ".");
		
		Double v1 = Double.parseDouble(valor1);
		Double v2 = Double.parseDouble(valor2);
		Double invalido = 999999.21;
		
		Double resultado = operador.equals("+") ? v1 + v2 : operador.equals("-") ? v1 - v2 : operador.equals("*") ? v1 * v2 : operador.equals("/") ? v1 / v2 : invalido;
		Double.toString(resultado);
		Double.toString(invalido);
		
		
		if (resultado.equals(invalido)) {
			JOptionPane.showMessageDialog(null, "ERRO NA OPERAÇÃO");
		} else {
			JOptionPane.showMessageDialog(null, resultado);
		}
	

				

	}

}
