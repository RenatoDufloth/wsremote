package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> lista = new HashMap<Integer,String>();
		lista.put(5505, "DBA");
		lista.put(5506,"DBA");
		lista.put(5530,"Analista");
		lista.put(5599,"Estagiario");
		lista.put(5599,"Full Stack");
		System.out.println(lista);
		System.out.println("Chave: " + lista.keySet());
		System.out.println("Valores: " + lista.values());

	}

}
