package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.util.Magica;

public class TestListObejto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		//1º forma de adicionar
		lista.add(new Cargo(
				Magica.s("Cargo"),
				Magica.s("Nivel"),
				Magica.f("Salario")
				));
		
		//2º forma de adicionar
		
		Cargo c = new Cargo();
		c.setNome(Magica.s("Nome"));
		c.setNivel(Magica.s("Nivel"));
		c.setSalario(Magica.f("Salario"));
		
		
		System.out.println("Nome do primeiro Cargo: " + lista.get(0).getNome());
		
		
		
		int totalJr = 0;
		float mediaSalario = 0;
		
		
		
		for (int cont=0;cont<lista.size();cont++) {
		
			System.out.println("Cargo numero: " + (cont+1));
			System.out.println("Nome do Cargo: " + lista.get(cont).getNome());
			System.out.println("Nivel do Cargo: " + lista.get(cont).getNivel());
			System.out.println("Salario do Cargo: " + lista.get(cont).getSalario());
			
			if (lista.get(cont).getNivel().equals("JR")) {
				totalJr++;
			}
			System.out.println("Total de JR: " + totalJr);
			
			
			mediaSalario += lista.get(cont).getSalario();
			System.out.println("Media de salario: " + (mediaSalario/lista.size()));
			
		}
		
		
		
		
		
		

	}

}
