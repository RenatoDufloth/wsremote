package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));

		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		
		float media = (nota1+nota2) /2;
		
		if (media >=6)
			System.out.printf("Sua Media foi de: %.2f então o Aluno %s foi aprovado", media, nome);
		else if (media < 4)
			System.out.printf("Sua Media foi de: %.2f então o Aluno %s foi reprovado", media, nome);
		else if(media>=4 && media <6)
			System.out.printf("Sua Media foi de: %.2f então o Aluno %s está de exame", media, nome);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
