package projeto3;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected int telefone;
	
	// Getters and Setters
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	// Methods
	abstract void cadastrar(String nome, String cpf, String endereco, int telefone);
	abstract void editar(String nome, String cpf, String endereco,int telefone);
	abstract void ler() ;
}
