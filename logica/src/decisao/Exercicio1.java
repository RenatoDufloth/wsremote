package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro n�mero"));

		String op = JOptionPane.showInputDialog("Digite uma opera��o matem�tica");

		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo n�mero"));




		if (op.contains("+"))
			System.out.print("Resultado = " + (numero1 + numero2));
		else if (op.contains("-"))
			System.out.print("Resultado = " + (numero1 - numero2));
		else if (op.contains("*"))
			System.out.print("Resultado = " + (numero1 * numero2));
		else if (op.contains("/")) {
			if (numero2 != 0) {
				System.out.print("Resultado = " + (numero1 / numero2));
			}
			else
				System.out.print("Erro, divis�o por 0");
		}
		else
			System.out.print("N�o � um operador");



	}

}