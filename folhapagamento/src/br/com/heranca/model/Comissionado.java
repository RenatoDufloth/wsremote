package br.com.heranca.model;

public class Comissionado extends Funcionario {
	
	private float salarioBase;
	private float comissao;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Salario Base: " + salarioBase + "\n" +
				"Comissão: " + comissao;
	}
	
	
	public void setAll(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super.setAll(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	
	
	
	public Comissionado() {
		super();
	}
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
	public void SalarioComissionado() {
		salarioBase = salarioBase + salarioBase * (comissao/100);
	}
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao/100;
	}
	

}
