package br.com.unixyz.beans;

/*
 * Design Pattern => cole��o de boas pr�ticas (padr�es) para OO
 * DTO (Data Transfer Object) => ensina a melhor forma de criar uma classe modelo.
 * 1�) TODOS os atributos devem ser privados.
 * 2�) CADA atributo deve possuir um Getter(output) e um Setter (input).
 * 3�) TODA classe modelo, deve possuir no m�nimo UM construtor vazio,
 * 		mais UM construtor para todos os atributos (cheio)
 * Obs.: Modelo = Beans = JavaBeans = TO = DTO = Model
 */

public class Aluno {
	
	private int rm;
	private String nome;
	private String email;
	
	
		
	public Aluno() {
		super();
	}



	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}



	public void setAll(int rm, String nome, String email)
	{
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}
	
	public String getAll(){
		return
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email;
		
	}
	
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/*public void preencherRm(int pRm){
		rm =pRm;
	}
	public int retornarRm() {
		return rm;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	

}
