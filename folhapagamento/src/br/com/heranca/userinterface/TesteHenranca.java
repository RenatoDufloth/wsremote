package br.com.heranca.userinterface;

import java.util.ArrayList;

import br.com.heranca.model.Chefe;
import br.com.heranca.model.Comissionado;
import br.com.heranca.model.Empreiteiro;
import br.com.heranca.model.Funcionario;
import br.com.heranca.model.Horista;

public class TesteHenranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Funcionario> lista;

		lista = new ArrayList<Funcionario>();
		
		
		lista.add(new Chefe("Regina", 1001, 8000.0f, 12.5f, 350.0f));
		lista.add(new Chefe("Michelle", 1002, 8000.0f, 15.0f, 500.0f));
		lista.add(new Horista("Isidro", 1003, 80.0f, 120));
		lista.add(new Horista("Lucas", 1004, 92.0f, 110));
		lista.add(new Comissionado("Renato Dufloth", 1005, 5000.0f, 14.0f));
		lista.add(new Comissionado("Luiz Fernando", 1006, 4587.0f, 22.0f));
		lista.add(new Empreiteiro("Marcello", 1007, 6543.23f));
		
		
		for (int pos =0; pos< lista.size(); pos++ ) {
			Funcionario f = lista.get(pos);
			
			System.out.printf("%d %30s R$  %8.2f%n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario());
		}
		
		
		
		
		
	}

}
