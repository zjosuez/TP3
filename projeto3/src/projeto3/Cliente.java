package projeto3;

public class Cliente extends Pessoa {

	private String dataCadastro;
	private boolean status;
	
	// Constructor
	public Cliente(String nome, boolean status, int cpf, String endereco, int telefone) {
		this.nome = nome;
		this.status = status;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
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
	
	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Methods
	@Override
	void cadastrar() {
		// TODO Auto-generated method stub
		System.out.println("josue");
	}

	@Override
	void editar() {
		// TODO Auto-generated method stub

	}

	@Override
	void deletar() {
		// TODO Auto-generated method stub

	}

	@Override
	void ler() {
		// TODO Auto-generated method stub

	}

	public void buscar() {
		
	}
}
