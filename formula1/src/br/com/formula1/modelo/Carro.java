package br.com.formula1.modelo;

public class Carro {
	
	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;
	
	
	//Sintexa do m�todo no Java
	//<modificador> <Tipo do Retorno> <nome do m�todo> (<Tipo do Param> <nome do Param>)
	
	public void preencherEscuderia(String param) {
		escuderia=param.toUpperCase();
	}
	
	public String retornarEscuderia() {
		return escuderia;
	}
	
	public void preencherNumero(short param) {
		if(param > 0) {
		numero = param;
		}
	}
	
	public short retornarNumero() {
		return numero;
	}
	
	public String ligar() {
		status = true;
		//System.out.println("Ligado");
		return "Ligado";
		
	}
	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		//System.out.println("Desligado");
		return "Desligado";
	}
	public boolean retornaStatus(){
		return status;
	}
	
	public void preencherValor(float param) {
		valor = param;
	}
	public float retornaPromocao() {
		return valor * (float) 0.9;
		
	}
	public void preencherBasico(short param, String param2, float param3) {
		numero = param;
		escuderia = param2;
		valor = param3;
	}
	public String exibirTudo() {
	 //return numero + "\n" + escuderia + "\n" + valor + "\n" + velocidadeAtual + "\n" + cor + "\n" + status;
		
		String state ="Ligado";
		if (status==false)
			state = "Desligado";
		
		return 
				"Escuderia: " + escuderia + "\n" +
				"N�mero: " + numero + "\n" +
				"Velocidade Atual: " + velocidadeAtual + "\n" +
				"Valor: R$" + valor + "\n" +
				"Cor: " + cor + "\n" +
				"Status: " + state;
	}
	public void acelerar (float param) {
		if(status != false)
		velocidadeAtual = velocidadeAtual + param;
		else
		System.out.println("Carro deve estar ligado");
	}
	
	public void desacelerar (float param) {
		if(status != false || velocidadeAtual != 0)
		velocidadeAtual = velocidadeAtual - param;
		else
		System.out.println("Carro deve estar ligado e acelerado para desacelerar");
	}
	public void brecar() {
		if(status != false || velocidadeAtual != 0)
		velocidadeAtual = 0;
		else
		System.out.println("Carro deve estar ligado e em movimento para brecar");
	}
	public float exibirVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	
	
	

}
