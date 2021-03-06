package br.com.formula1.implementacao;

import javax.swing.JOptionPane;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		//Instanciando um objeto => criar as repartições do objeto.
		Carro objeto = new Carro();
		
		objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia:"));

		//objeto.preencherNumero((short) 1);
		
		objeto.preencherNumero(Short.parseShort(JOptionPane.showInputDialog("Numero do Carro:")));
		
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do carro")));
		
		
		System.out.println("Escuderia: " + objeto.retornarEscuderia());
		
		System.out.println("Numero do carro: " +objeto.retornarNumero());
		
		System.out.println("Status: " + objeto.ligar() + " Variavel Status: " + objeto.retornaStatus());
		
		System.out.println("Status: " + objeto.desligar() + " Variavel Status: " + objeto.retornaStatus());
		
		System.out.println("Valor Promocional: R$" + objeto.retornaPromocao());
		
		objeto.preencherBasico(Short.parseShort(JOptionPane.showInputDialog("Numero do Carro:")), JOptionPane.showInputDialog("Escuderia:"), Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do carro")));
		
		System.out.println(objeto.exibirTudo());
				
		
		
		objeto.ligar();
		System.out.println(objeto.retornaStatus());
		objeto.acelerar(Float.parseFloat(JOptionPane.showInputDialog("Digite velocidade")));
		System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.desacelerar(Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para desacelerar")));
		System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.brecar();
	    System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.desligar();
		System.out.println(objeto.retornaStatus());

	}

}
