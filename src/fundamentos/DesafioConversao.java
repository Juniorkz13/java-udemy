package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {

		String s1 = JOptionPane.showInputDialog("Digite o primeiro salário:");
		String s2 = JOptionPane.showInputDialog("Digite o segundo salário:");
		String s3 = JOptionPane.showInputDialog("Digite o terceiro salário:");

		s1 = s1.replace(",", ".");
		s2 = s2.replace(",", ".");
		s3 = s3.replace(",", ".");

		double s11 = Double.parseDouble(s1);
		double s22 = Double.parseDouble(s2);
		double s33 = Double.parseDouble(s3);

		double media = (s11 + s22 + s33) / 3;

		System.out.printf("A média salarial é de R$%.2f.", media);
	}

}
