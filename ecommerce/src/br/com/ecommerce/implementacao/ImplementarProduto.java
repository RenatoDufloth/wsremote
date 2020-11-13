package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livros;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		//Cria pela Super
		Produto objeto = null;



		do {

			char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
			if (opcao == 'L') {
				objeto = new Livros(
						Magica.s("Descrição"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("Codigo"),
						Magica.i("Qtde"),
						Magica.s("Editora"),
						Magica.s("Autor"),
						Magica.s("ISBN")        			
						);        	

			}
			else {
				objeto = new Cd(
						Magica.s("Descrição"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("Codigo"),
						Magica.i("Qtde"),
						Magica.s("Artista"),
						Magica.i("Total Faixas"),
						Magica.b("É Lançamento?")        			
						);

			}

			JOptionPane.showMessageDialog(null,objeto.getAll());
			JOptionPane.showMessageDialog(null,objeto.retornarImposto());

		} while(JOptionPane.showConfirmDialog(
				null, 
				"Deseja continuar?", 
				"Pergunta",
				JOptionPane.YES_NO_OPTION
				)==0
				);



















	}
}
