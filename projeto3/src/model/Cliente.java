package model;

import java.util.*;

public class Cliente extends Pessoa {
	
	private boolean status;
	
	
	// Constructor
	public Cliente(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
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

	// Methods
//	@Override
//	public void cadastrar(String nome, String cpf, String endereco, int telefone) {
//		
//	}
//	@Override
//	public void editar(String nome, String cpf, String endereco,int telefone) {
//		setNome(nome);
//		setCpf(cpf);
//		setEndereco(endereco);
//		setTelefone(telefone);
//	}
//
//	@Override
//	public void verPessoa() {
//		System.out.println("-----Cliente-----\nDia do cadastro: " + dataCadastro + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
//				+ "\nTelefone: " + telefone + "\n");
//	}

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
		return "-----Cliente----- " + "\nNome: " + nome + "\nCpf: " + cpf + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n";
	}
}

