package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Analista");
		lista.add("DBA");
		lista.add("Desenvolvedor");
		lista.add("DBA");
		System.out.println(lista);
		System.out.println("Exibindo o segundo elemento: " +lista.get(1));
		int maior8=0;
		int totalDBA=0;
		for (int contador=0;contador<lista.size();contador++){
			System.out.println("Elemento " + contador + " :" + lista.get(contador));
			if (lista.get(contador).equals("DBA")){
				totalDBA++;
			}
			if(lista.get(contador).length() > 8) {
				maior8++;
			}
		}
		System.out.println("Total de DBA: " + totalDBA);
		System.out.println("Mais 8 caracteres: " + maior8);
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista);
		lista.remove(2);
		System.out.println("Lista com o terceiro elemento removido: " + lista);		
		
	}

}
