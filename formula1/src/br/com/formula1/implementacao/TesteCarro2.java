package br.com.formula1.implementacao;
import javax.swing.JOptionPane;

import br.com.formula1.modelo.Carro;

public class TesteCarro2 {

	public static void main(String[] args) {
		Carro objeto = new Carro();

		objeto.ligar();
		System.out.println(objeto.retornaStatus());
		objeto.acelerar(Float.parseFloat(JOptionPane.showInputDialog("Digitte um valor para acelerar")));
		System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.desacelerar(Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para desacelerar")));
		System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.brecar();
		System.out.println("Velocidade atual:" + objeto.exibirVelocidadeAtual() + " KM/H");
		objeto.desligar();
		System.out.println(objeto.retornaStatus());

	}

}
