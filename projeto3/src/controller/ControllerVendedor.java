package controller;

import model.Vendedor;
import model.Dados;
import view.CadastraVendedor;

/**
 * Controller responsavel pelo metodo de cadastro do vendedor
 * @author Josue Teixeira Santana
 *
 */
public class ControllerVendedor {
	
	private CadastraVendedor view;
	
	public ControllerVendedor(CadastraVendedor view) {
		
		this.view = view;
	}
	
	/**
	 * Metodo que recebe os valores da JText na view CadastraVendedor
	 * armazena nas suas respectivas variaveis e depois cria um novo vendedor
	 * no array de vendedor na classe Dados
	 * @see Dados 
	 */
	public void CadastrarVendedor() {
		
		String nome = view.getNomeTexto().getText();
		String cpf = view.getCpfTexto().getText();
		String endereco = view.getEnderecoTexto().getText();
		String telefone = view.getTelefoneTexto().getText();
		
		Dados.getVendedor().add(new Vendedor(nome, cpf, endereco, telefone));
	}
}
