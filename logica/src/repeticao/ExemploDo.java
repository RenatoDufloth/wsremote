package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		char resposta = 0;


		do {
			int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
			float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
			System.out.println("Total: " + (qtde * valor));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").toUpperCase().charAt(0);
		}


		while (resposta == 'S');



	}

}
