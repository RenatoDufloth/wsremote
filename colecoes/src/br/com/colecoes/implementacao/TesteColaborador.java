package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Colaborador;
import br.com.colecoes.util.Magica;

public class TesteColaborador {

	public static void main(String[] args) {
		Colaborador c = new Colaborador();
		
		c.setNome(Magica.s("Nome"));
		c.setCpf(Magica.s("CPF"));
		
		
	
		
		List<String> lista = new ArrayList<String>();
		
		do {
			
		lista.add(Magica.s("Digite o numero do telefone"));
					
		}while(Magica.b("Deseja cadastrar um novo telefone?"));
		
		c.setFone(lista);
		
		System.out.println(c.getNome());
		System.out.println(c.getCpf());
		System.out.println(c.getFone());
		// ou
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Fone " + contador + " :" + lista.get(contador));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
