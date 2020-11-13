package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		Conta conta =null;
		
		
		do {
			char opcao = Magica.s("Digite <C> para Corrente ou <P> para pounpança").charAt(0);
			
			if (opcao == 'C') {
				conta = new Corrente(
						Magica.sh("Numero"),
						Magica.by("Digito"),
						Magica.sh("Agencia"),
						0,
						new Cliente(
								Magica.i("ID"),
								Magica.s("Nome"),
								Magica.s("CPF"),
								new Endereco()
								),
						Magica.f("Limite"),
						Magica.f("Taxa")		
						); 
				
			
			

			}
			else {
				conta = new Poupanca(
						Magica.sh("Numero"),
						Magica.by("Digito"),
						Magica.sh("Agencia"),
						Magica.f("Saldo"),
						new Cliente(
								Magica.i("ID"),
								Magica.s("Nome"),
								Magica.s("CPF"),
								new Endereco()
								),
						Magica.f("Rendimento")
						);
				
				
			}

			System.out.println(conta.depositar(1000));
			System.out.println(conta.getSaldo());
			System.out.println(conta.sacar(2000));
			System.out.println(conta.getSaldo());
			System.out.println(conta.getAll());
			
				
		}while(JOptionPane.showConfirmDialog(
				null, 
				"Deseja fazer outra operação?", 
				"Pergunta",
				JOptionPane.YES_NO_OPTION
				)==0
				);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
