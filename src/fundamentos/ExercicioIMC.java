package fundamentos;

import javax.swing.JOptionPane;

public class ExercicioIMC {

	public static void main(String[] args) {

		String peso = JOptionPane.showInputDialog("Insira seu peso em quilogramas (Kg):");
		String altura = JOptionPane.showInputDialog("Insira sua altura em metros (m):");

		String p = peso.replace(",", ".");
		String a = altura.replace(",", ".");

		Double valorpeso = Double.parseDouble(p);
		Double valoraltura = Double.parseDouble(a);

		double imc = valorpeso / (valoraltura * valoraltura);

		JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f.", imc));

		if (imc >= 40.0) {
			JOptionPane.showMessageDialog(null, "Classificação: Obesidade Grave.");
		} else if (imc >= 30.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null, "Classificação: Obesidade.");
		} else if (imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Classificação: Sobrepeso.");
		} else if (imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Classificação: Normal.");
		} else {
			JOptionPane.showMessageDialog(null, "Classificação: Magreza.");
		}

	}

}
