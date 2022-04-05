package model;

/**
 * Classe responsavel pelos dados do vendedor, essa classe implementa os
 * atributos e metodos da classe Pessoa
 * @author Josue Teixeira Santana
 *
 */
public class Vendedor extends Pessoa {

	private int qtdVendas;
	
	/**
	 * Contrutor da classe vendedor responsavel pelo armazenamento
	 * dos dados do vendedor
	 * @param nome
	 * @param cpf
	 * @param endereco
	 * @param telefone
	 */
	public Vendedor(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	/**
	 * Metodos getters e setters referente aos atributos da classe Cliente
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

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas() {
		this.qtdVendas += 1;
	}
	
	/**
	 * Metodo responsavel por sobrescrever o objeto
	 * @return - Retorna uma String contento os dados do vendedor
	 */
	@Override
	public String toString() {
		return "-----Vendedor----- " + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n";
	}
}
