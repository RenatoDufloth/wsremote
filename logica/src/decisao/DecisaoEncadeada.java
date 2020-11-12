package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();

		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));

		if (faltas < 20 ) {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));

			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));

			float media = (nota1+nota2) /2;

			

			if (media >=6) {
				System.out.printf("Sua Media foi de: %.2f então o Aluno %s foi aprovado", media, nome);
			}
			else if (media < 4) {
				System.out.printf("Sua Media foi de: %.2f então o Aluno %s foi reprovado", media, nome);
			}
			else {
				System.out.printf("Sua Media foi de: %.2f então o Aluno %s está de exame", media, nome);

			}

		}	

		else 
			System.out.printf("Aluno %s reprovado por faltas", nome);












	}

}
