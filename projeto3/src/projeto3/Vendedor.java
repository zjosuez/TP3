package projeto3;

public class Vendedor extends Pessoa {

	private RoupaEAcessorio roupaeacessorio;
	private int qtdVendas;
	
	// Constructor
	public Vendedor(String nome, RoupaEAcessorio roupaeacessorio, int qtdVendas, int cpf, String endereco, int telefone) {
		super();
		this.roupaeacessorio = roupaeacessorio;
		this.qtdVendas = qtdVendas;
	}

	// Getters and Setters
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
	
	public RoupaEAcessorio getRoupaeacessorio() {
		return roupaeacessorio;
	}

	public void setRoupaeacessorio(RoupaEAcessorio roupaeacessorio) {
		this.roupaeacessorio = roupaeacessorio;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	@Override
	void cadastrar() {
		// TODO Auto-generated method stub

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

}
