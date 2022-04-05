package controller;

import model.Cliente;
import model.Dados;
import view.CadastraCliente;

/**
 * Responsavel pelo metodo de cadastramento do cliente
 * @author Josue Teixeira Santana	
 *
 */
public class ControllerCliente {
	
	private CadastraCliente view;
	
	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view CadastraCliente
	 */

	public ControllerCliente (CadastraCliente view) {
		
		this.view = view;
	}
	
	/**
	 * Metodo que recebe os valores da JText na view CadastraCliente
	 * armazena nas suas respectivas variaveis e depois cria um novo cliente
	 * no array de cliente na classe Dados
	 * @see Dados 
	 */
	public void CadastrarCliente() {
		
		String nome = view.getNomeTexto().getText();
		String cpf = view.getCpfTexto().getText();
		String endereco = view.getEnderecoTexto().getText();
		String telefone = view.getTelefoneTexto().getText();
		
		Dados.getCliente().add(new Cliente(nome, cpf, endereco, telefone));
	}
}
