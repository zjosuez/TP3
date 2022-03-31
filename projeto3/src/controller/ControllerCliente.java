package controller;

import model.Cliente;
import model.Dados;
import view.CadastraCliente;

public class ControllerCliente {
	
	private CadastraCliente view;

	public ControllerCliente (CadastraCliente view) {
		
		this.view = view;
	}
	
	public void CadastrarCliente() {
		
		String nome = view.getNomeTexto().getText();
		String cpf = view.getCpfTexto().getText();
		String endereco = view.getEnderecoTexto().getText();
		String telefone = view.getTelefoneTexto().getText();
		
		Dados.getCliente().add(new Cliente(nome, cpf, endereco, telefone));
	}
}
