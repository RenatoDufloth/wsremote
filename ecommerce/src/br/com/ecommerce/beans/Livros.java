package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoProduto;

public class Livros extends Produto implements PadraoProduto {
	
	private String editora;
	private String autor;
	private String isbn;
	
	
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"ISBN: " + isbn + "\n" +
				"Autor: " + autor + "\n" +
				"Editora: " + editora;
	}
	
	
	
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String editora, String autor,
			String isbn) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.editora = editora;
		this.autor = autor;
		this.isbn = isbn;
	}



	public Livros() {
		super();
	}



	public Livros(String descricao, float valorVenda, float valorCompra, int id, int qtde, String editora, String autor,
			String isbn) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.editora = editora;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	@Override
	public float retornarImposto() {
		// TODO Auto-generated method stub
		return  getValorVenda() * (float) 0.05;
	}



	@Override
	public float obterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return getValorVenda() - getValorVenda() * (param/100);
	}
	
	

}
