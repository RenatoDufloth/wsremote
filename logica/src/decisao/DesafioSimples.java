package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Nome");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		if (idade >= 70 || (idade >= 16 && idade <= 17))
			System.out.printf("%s seu voto � facultativo", nome);
		if (idade >= 18 && idade < 70)
			System.out.printf("%s seu voto � obrigatorio", nome);
		if (idade < 16)
			System.out.printf("%s voc� ainda n�o pode votar", nome);
	}

}