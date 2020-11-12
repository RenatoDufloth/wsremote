package br.com.xpto.implementacao;

import javax.swing.JOptionPane;

import br.com.xpto.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		 Televisao objeto = new Televisao();
		 
		 objeto.preencherMarca(JOptionPane.showInputDialog("Informe a marca"));
		 objeto.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de compra")));
		 objeto.mudarCanal(Integer.parseInt(JOptionPane.showInputDialog("Digite um canal")));
		 
		 objeto.ligar();
		 //objeto.desligar();
		 
		 
		 objeto.aumentarVolume();
		 objeto.aumentarVolume();
		 objeto.aumentarVolume();
		 objeto.aumentarVolume();
		 objeto.aumentarVolume();
		 objeto.diminuirVolume();
		 objeto.diminuirVolume();
		 objeto.diminuirVolume();
	
		 System.out.println(objeto.retornarResumo());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
