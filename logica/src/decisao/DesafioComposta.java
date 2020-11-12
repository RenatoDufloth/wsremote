package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		
		if (qtde >=20 && qtde <= 40)
			System.out.printf("Produto %s com Estoque Normal", produto);
		else if (qtde > 40 && qtde <= 60)
			System.out.printf("Produto %s com Estoque Alto", produto);
		else if (qtde > 60)
			System.out.printf("Produto %s com Estoque lotado", produto);
		else
			System.out.printf("Produto %s com Estoque baixo", produto);
	}

}
