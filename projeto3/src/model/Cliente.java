package model;

/**
 * Classe que contem as informacoes do Cliente
 * Essa classe herda os atributos e metodos da classe Pessoa
 * @see Pessoa
 * 
 * @author Josue Teixeira Santana
 */
public class Cliente extends Pessoa {
	
	private boolean status;
	
	/**
	 * Contrutor da classe Cliente
	 * 
	 * @param nome - nome do cliente	
	 * @param cpf - cpf do cliente
	 * @param endereco - endereco do cliente
	 * @param telefone - telefone do cliente
	 */
	public Cliente(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	
	
	/**
	 * Metodos getters e setters referente aos atributos da classe Cliente
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * Metodo responsavel por sobrescrever o objeto
	 * @return - Retorna uma String contento os dados do cliente
	 */
	@Override
	public String toString() {
		return "-----Cliente----- " + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n";
	}
}

