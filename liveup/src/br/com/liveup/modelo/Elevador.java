package br.com.liveup.modelo;

public class Elevador {
	
	int andarAtual;
	int andarMaximo;
	int andarMinimo;
	int capacidadePessoas;
	int qtdePessoas;
	String nome;
	
	
	public void preencherNome(String pNome) {
		nome = pNome;
	}
	
	public void andarMaximo(int pMaximo) {
		andarMaximo = pMaximo;
	}
	public void andarMinimo(int pMinimo) {
		andarMinimo = pMinimo;
	}
	public void preencherCapacidade(int pCapacidade) {
		capacidadePessoas = pCapacidade;
	}	
	
	public void preencherAndarAtual(int pAndar) {
		if ((andarAtual <= andarMaximo) && (andarAtual >= andarMinimo))
		andarAtual = pAndar;
		else
			System.out.println("Andar não existe");
	}

	public void entrar(int pEntrar) {
		if ((qtdePessoas + pEntrar) > capacidadePessoas) {
			System.out.println("Limite de pessoas execedido");
		}
		else
			qtdePessoas = qtdePessoas + pEntrar;		
	}
	public void sair(int pSair) {
		if((qtdePessoas - pSair) >= 0) {
			qtdePessoas = qtdePessoas - pSair;
		}
		else
			qtdePessoas = 0;
	}
	public void subir(){
		if(andarAtual == andarMaximo)
			System.out.println("Já no ultimo andar");
		else
			andarAtual = andarAtual + 1;
				
	}
	
	public void descer(){
		if(andarAtual == andarMinimo)
			System.out.println("Já no andar minimo");
		else
			andarAtual = andarAtual - 1;
				
	}
	
	public String retornarTudo() {
		return 
				"Nome: " + nome + "\n" +
				"Qtde maxima de Pessoas: " + capacidadePessoas + "\n" +
				"Andar Maximo: " + andarMaximo + "\n" +
				"Andar Minimo: " + andarMinimo + "\n" +
				"Andar atual: " + andarAtual + "\n" +
				"Qtde de pessoas: " + qtdePessoas;
	}

	
	
	
	
	
	
}
