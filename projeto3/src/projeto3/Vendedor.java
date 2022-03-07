package projeto3;

public class Vendedor extends Pessoa {

	private RoupaEAcessorio roupaeacessorio;
	private int qtdVendas;
	
	// Constructor
	public Vendedor(String nome, String cpf, String endereco, int telefone, RoupaEAcessorio roupaeacessorio) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.roupaeacessorio = roupaeacessorio;
	}

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
	void cadastrar(String nome, String cpf, String endereco, int telefone) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	@Override
	void editar(String nome, String cpf, String endereco,int telefone) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	@Override
	void ler() {
		System.out.println("Nome do vendedor: " + nome + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\nTelefone: " + telefone);
	}
	
	public void verProduto() {
		RoupaEAcessorio a = getRoupaeacessorio();
		System.out.println(a.toString());
	}
}
