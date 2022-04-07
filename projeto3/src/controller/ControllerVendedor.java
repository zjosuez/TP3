package controller;

import model.Vendedor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.RoupaEAcessorio;
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
		Object produto = view.getBuscarProduto().getSelectedItem();
		
		Dados.getVendedor().add(new Vendedor(nome, cpf, endereco, telefone, produto));
	}
	
    /**
     * Gera um novo array de produto
     * 
     * @return - nArrayProduto  um novo array de produto
     */
	public String[] verProduto() {
		
		List<String> nArrayProduto = new ArrayList<>();
		
		for (RoupaEAcessorio product : Dados.getProducts()) {
			nArrayProduto.add(product.getNome());
		}
		
		return nArrayProduto.toArray(new String[0]);
	}

    /**
     * Atualiza a lista de produto utilizando o comboBox
     * 
     * @return - retorna um novo comboBox
     */
	public DefaultComboBoxModel<String> atualizarProduto() {
	
		return new DefaultComboBoxModel<>(verProduto());
	}
}
