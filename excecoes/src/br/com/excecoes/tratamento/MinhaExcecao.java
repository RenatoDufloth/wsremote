package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MinhaExcecao {
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto est� nulo";
			
		}
		else if (e instanceof NumberFormatException) {
			return "Numero invalido";
		}
		else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		}
		else if ( e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor Estourou";
		}
		else {
			e.printStackTrace();
			//throw new RuntimeException(); // Programador est� lan�ando a exce��o
			return "Exce��o n�o tratada";
		}
		
		
		
	}

}
