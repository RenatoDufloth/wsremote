package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MinhaExcecao;

public class TesteExcecoes {
	
	
	/*
	 * Dois tipos de Exceções:
	 * Checked (AC) => exceções que ocorrem antes da compilação.
	 * Uncheked (DC) => exceções que sao disparadas somente apos a compilação 
	 * exemplo: NullPoint, NumberFormat....
	 */
	

	public static void main(String[] args) {
		try {
		int numero = Integer.parseInt("5");
		System.out.println(numero);
		
		String nome = "";
		System.out.println("Qtde de letras: " + nome.length());
		

		double vetor[] = new double[2];
		vetor[0] = 5.54;
		vetor[1] = 6.12;
		vetor[2] = 15.8;
	
		
		} 
		catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
			//e.printStackTrace();		
		}
		finally {
			System.out.println("Até logo");
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
