package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Nome");
		
		short alfab = Short.parseShort(JOptionPane.showInputDialog("Alfabetizado? Digite 1 para sim e 0 para n�o"));
		
		if (alfab == 1) {
		
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
			if (idade >= 70 || (idade >= 16 && idade <= 17))
				System.out.printf("%s seu voto � facultativo", nome);
			else if (idade >= 18 && idade < 70)
				System.out.printf("%s seu voto � obrigatorio", nome);
			else
				System.out.printf("%s voc� ainda n�o pode votar", nome);
		
		}
		
		else 
			System.out.printf("%s voc� n�o pode votar por n�o ser alfabetizado", nome);
	}

}
