package repeticao;

import javax.swing.JOptionPane;
import java.util.Random;

public class DesafioDo {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10"));
		while (a>100) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10"));
		}

		Random random = new Random();
		
		int b = random.nextInt(10);

		int tentativas = 1;




		do {

			tentativas = tentativas + 1;

			if (a > b) {
				System.out.println("Valor informado maior, tente novamente");
			}

			if (a < b) {
				System.out.println("Valor informado menor, tente novamente");
			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo numero de 0 a 10"));
			
		}while (a != b);

		System.out.println("Parab�ns, voc� ganhou, N� de tentativas: " + tentativas + " Valor era: " + b);
	}

}
