package projeto3;

import java.util.*;

public class Cliente extends Pessoa {

	private Date dataCadastro;
	private boolean status;
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	// Constructor
	public Cliente(String nome, boolean status, String cpf, String endereco, int telefone, Date dataCadastro) {
		this.nome = nome;
		this.status = false;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
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
		setDataCadastro(dataCadastro);
		listaCliente.add(new Cliente(nome, status, cpf, endereco, telefone, dataCadastro));
		System.out.println("O cliente " + nome + " foi cadastrado com sucesso!");
	}
	@Override
	void editar(String nome, String cpf, String endereco,int telefone) {
		int posicaoEditar = 0;
		listaCliente.get(posicaoEditar).setNome(nome);
		listaCliente.get(posicaoEditar).setCpf(cpf);
		listaCliente.get(posicaoEditar).setEndereco(endereco);
		listaCliente.get(posicaoEditar).setTelefone(telefone);
	}

	void deletar(int posicaoExcluir) {
		System.out.println("O produto " + listaCliente.get(posicaoExcluir).getNome() + " foi removido com sucesso!");
		listaCliente.remove(posicaoExcluir);

	}

	@Override
	void ler() {
		for(int i = 0; i < listaCliente.size(); i++) {
			System.out.println(listaCliente.get(i));
		}
	}

	public void buscar(String nomeBusca) {
		boolean aux = false;
		for(int i = 0; i < listaCliente.size() ; i++) {
			if (listaCliente.get(i).getNome().equals(nomeBusca)) {
				aux = true;
				System.out.println("O Cliente " + listaCliente.get(i).getNome() + " foi encontrado");
			}
		}
		if (aux == false) {
			System.out.println("O cliente " + nomeBusca + " não foi encontrado");
		}
	}


	@Override
	public String toString() {
		return "-----Cliente Cadastrado-----\n Dia do cadastro: " + dataCadastro + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone;
	}
	
	
}

