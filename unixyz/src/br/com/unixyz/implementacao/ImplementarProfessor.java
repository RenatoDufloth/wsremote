package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		Professor p = new Professor();
		Endereco e = new Endereco();
		p.setId(1);
		p.setNome("Re");
		p.setTitulacao("Dr");
		p.setFone("1111-1111");
		p.setEndereco(e);
		e.setLogradouro("av Paulista");
		e.setNumero("3500");
		e.setBairro("Centro");
		e.setCidade("S�o Paulo");
		e.setUf("SP");
		e.setCep("12345-000");
		e.setComplemento(false);
		System.out.println("Nome: " + p.getNome());
		System.out.println("Endereco: " + p.getEndereco().getAll());
		

	}

}
