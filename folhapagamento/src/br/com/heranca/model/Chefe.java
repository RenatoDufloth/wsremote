package br.com.heranca.model;

public class Chefe extends Funcionario {
	
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Salario Base: " + salarioBase + "\n" +
				"Adicional da Função: " + adicionalFuncao + "\n" +
				"Beneficio Terno: " + beneficioTerno;
	}
	
	

	public void setAll(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super.setAll(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	
	

	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	public Chefe() {
		super();
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	

	
	public float calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}
	

}
