package br.com.heranca.model;

public abstract class Funcionario {
	
	
	private String nome;
	private int numeroRegistro;
	
	
	
	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"Numero do Registro: " + numeroRegistro;
	
	}
	
	
	
	public void setAll(String nome, int numeroRegistro) {
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	
	
	public abstract float calcularSalario();
	
	
	
	
	
	

}
