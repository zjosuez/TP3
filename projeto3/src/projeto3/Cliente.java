package projeto3;

import java.util.*;

public class Cliente extends Pessoa {
	private Date dataCadastro;
	private boolean status;
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	GregorianCalendar d = new GregorianCalendar();
	Date now = d.getTime();
	// Constructor
	public Cliente() {

	}
	
	
	//Getters and Setters
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
	
	public Date getDataCadastro() {
		
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
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
	void cadastrar(String nome, String cpf, String endereco, int telefone) {
		setNome(nome);
		setStatus(true);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
		setDataCadastro(now);
		System.out.println("O cliente " + nome + " foi cadastrado com sucesso!");
	}
	@Override
	void editar(String nome, String cpf, String endereco,int telefone) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
	}
	void deletar(int posicaoExcluir) {
		System.out.println("O produto " + listaCliente.get(posicaoExcluir).getNome() + " foi removido com sucesso!");
		listaCliente.remove(posicaoExcluir);

	}

	@Override
	void verPessoa() {
		System.out.println("-----Cliente-----\nDia do cadastro: " + dataCadastro + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n");
	}

	public void buscar(String nomeBusca) {
		if (nomeBusca.equals(getNome())) {
			System.out.println("O cliente " + nomeBusca + " Foi encontrado.\n");
		} else {
			System.out.println("O cliente " + nomeBusca + " Nao foi encontrado\n");
		}
	}

	public void comprarProduto(Venda produtoAComprar) {
		System.out.println("\nO produto " + produtoAComprar.getRoupaeacessorio().getNome() + " Foi comprado com sucesso!");

	}

	@Override
	public String toString() {
		return "-----Cliente-----\nDia do cadastro: " + dataCadastro + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n";
	}
}

