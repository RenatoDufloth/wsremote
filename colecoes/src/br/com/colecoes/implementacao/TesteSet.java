package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("Estagiario");
		lista.add("Analista");
		lista.add("Suporte");
		lista.add("DBA");
		lista.add("Full Stack");
		System.out.println(lista);
		System.out.println("Existe DBA?" + lista.contains("DBA"));
	}

}
