package br.com.bankofoz.beans;


import br.com.bankofoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {
	
	private float rendimento;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" + 
				"Rendimento: " + rendimento;
		
	}
	
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}
	
	

	public Poupanca() {
		super();
	}



	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}



	public float getRendimento() {
		return rendimento;
	}



	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	
	
	public void creditarRedimentos() {
		
		setSaldo(getSaldo() + getSaldo() * (rendimento/100));
	
	}
	
	@Override
	public boolean sacar(float param) {
		if(param > getSaldo()) {
			return false;
		}
		else {
		setSaldo(getSaldo() - param);
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
