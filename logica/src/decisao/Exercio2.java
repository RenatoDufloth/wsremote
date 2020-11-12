package decisao;

import javax.swing.JOptionPane;

public class Exercio2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite Primeiro número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite Segundo número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite Terceiro número"));

		if (a>b && a>c) {
			System.out.println("1º) " + a);
			if (b>c) {
				System.out.println("2º) " + b);
				System.out.println("3º) " + c);
			}
			else {
				System.out.println("2º) " + c);
				System.out.println("3º) " + b);
			}
		}
		else if (b>a && b>c) {
			System.out.println("1º) " + b);
			if (a>c) {
				System.out.println("2º) " + a);
				System.out.println("3º) " + c);
			}
			else {
				System.out.println("2º) " + c);
				System.out.println("3º) " + a);
			}
		}
		else {
			System.out.println("1º) " + c);
			if (a>b) {
				System.out.println("2º) " + a);
				System.out.println("3º) " + b);
			}
			else {
				System.out.println("2º) " + b);
				System.out.println("3º) " + a);
			}


		}



	}
}
