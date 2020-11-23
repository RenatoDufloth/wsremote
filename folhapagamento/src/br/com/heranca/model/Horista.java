package br.com.heranca.model;

public class Horista extends Funcionario {
	
	private float valorHora;
	private int numeroHoras;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Valor da Hora: " + valorHora + "\n" +
				"Numero de Horas: " + numeroHoras;
	}
	
	
	public void setAll(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super.setAll(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	
	
	public Horista() {
		super();
	}
	public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numeroHoras;
	}
	

}
