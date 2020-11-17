package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

/*
 * Polimofismo:ocorre quando temos dois metodos com o mesmo nome,
 * fazendo ações diferentes.
 * Override (sobrescrita) :  quando os metodos estao em classes diferentes (getAll())
 * Overload (sobrecarga): quando os metodos estão na mesma classe
 * (devem possuir assinaturas diferentes - parametros)
 */

public class Corrente extends Conta  implements PadraoConta {
	private float limite;
	private float taxa;
	
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Taxa: " + taxa + "\n" +
				"Limite: " + limite;
		
	}
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	
	
	public Corrente() {
		super();
	}
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}




	
	public void debitarTaxa() {
		
		setSaldo(getSaldo()-taxa);
		
	}
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
		
	}
	
	@Override
	public boolean sacar(float param) {
		if(param > (getSaldo() + limite)) {
			return false;
		}
		else {
			setSaldo(getSaldo()-param);
			return true;
		}
		
	}


	@Override
	public boolean depositar(float param) {
		if (param <=0) {
			return false;
		}
		else {
			setSaldo(getSaldo()+param);
			return true;
		}
	}
	
	

}
