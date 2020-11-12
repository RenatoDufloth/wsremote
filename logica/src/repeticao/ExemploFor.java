package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {

		byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("digite um numero"));
		for (int cont=0;cont<11;cont++) {
			System.out.println(tabuada + " X " + cont + " = " + (tabuada*cont));
		}

	}

}
