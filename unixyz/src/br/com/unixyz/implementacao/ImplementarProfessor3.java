package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor professor = new Professor(
				1,
				"Renato",
				"DR",
				"1234-6789",
				new Endereco(
						"Av Paulista",
						"3500",
						false,
						"Centro",
						"Sampa",
						"SP",
						"12345-000"
						)
				);
		System.out.println(professor.getAll());
		
	}

}
