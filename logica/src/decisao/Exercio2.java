package decisao;

import javax.swing.JOptionPane;

public class Exercio2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite Primeiro n�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite Segundo n�mero"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite Terceiro n�mero"));

		if (a>b && a>c) {
			System.out.println("1�) " + a);
			if (b>c) {
				System.out.println("2�) " + b);
				System.out.println("3�) " + c);
			}
			else {
				System.out.println("2�) " + c);
				System.out.println("3�) " + b);
			}
		}
		else if (b>a && b>c) {
			System.out.println("1�) " + b);
			if (a>c) {
				System.out.println("2�) " + a);
				System.out.println("3�) " + c);
			}
			else {
				System.out.println("2�) " + c);
				System.out.println("3�) " + a);
			}
		}
		else {
			System.out.println("1�) " + c);
			if (a>b) {
				System.out.println("2�) " + a);
				System.out.println("3�) " + b);
			}
			else {
				System.out.println("2�) " + b);
				System.out.println("3�) " + a);
			}


		}



	}
}
