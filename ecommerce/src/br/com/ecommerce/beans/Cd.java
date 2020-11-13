package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoProduto;

public class Cd extends Produto implements PadraoProduto {
	
	private String artista;
	private int totalFaixas;
	private boolean lacamento;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Artista: " + artista + "\n" +
				"Total de Faixas: " + totalFaixas + "\n" +
				"Lançamento: " + lacamento;
		
		
	}
	
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lacamento) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lacamento = lacamento;
	}
	
		
	public Cd() {
		super();
	}
	public Cd(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lacamento) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lacamento = lacamento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public boolean isLacamento() {
		return lacamento;
	}
	public void setLacamento(boolean lacamento) {
		this.lacamento = lacamento;
	}

	@Override
	public float retornarImposto() {
		// TODO Auto-generated method stub
		return getValorVenda()* (float) 0.07;
	}

	@Override
	public float obterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return getValorVenda() - getValorVenda() * (param/90);
	}
	
	
	
	

}
