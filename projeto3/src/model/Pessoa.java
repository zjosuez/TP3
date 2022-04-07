package model;

/**
 * Classe responsavel pela abstracao de Pessoa.
 * 
 * @author Josue Teixeira Santana	
 *
 */
public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected String telefone;
	
	/**
	 * Todos os metodos (getters e setters) referente aos atributos da classe
	 * @return - Getters e setters
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
