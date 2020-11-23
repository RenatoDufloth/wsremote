package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO => Data Access Object
 * Classes que contem os metodos que irão manipular os dados
 * Manipular dos dados = CRUD
 * C => Create (inserir o dado na tabela)
 * R => Read (consultar o dado na tabela)
 * U => Update (alterar um dado na tabela)
 * D => Delete (apagar um dado na tebela)
 * 
 * Classe CrudRepository<1ªClasseBeans,2ºTipodeDadoPK>
 * 
 * 
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
	
	
	/*
	 * save() => gravar/alterar
	 * findAll() => consultar
	 * deleteAll() => apagar
	 * 
	 * 
	 */

}
