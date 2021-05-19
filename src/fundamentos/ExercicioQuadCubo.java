package fundamentos;

import javax.swing.JOptionPane;

public class ExercicioQuadCubo {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Insira o valor para encontrar seu quadrado (x²) e seu cubo (x³):");
		
		String valor = entrada.replace(",", ".");
		
		Double v = Double.parseDouble(valor);
		
		double quadrado = Math.pow(v, 2);
		double cubo = Math.pow(v, 3);
		
		JOptionPane.showMessageDialog(null, String.format("O quadrado de %.2f é igual a %.2f.", v, quadrado));
		JOptionPane.showMessageDialog(null, String.format("O cubo de %.2f é igual a %.2f.", v, cubo));
		
		

	}

}
