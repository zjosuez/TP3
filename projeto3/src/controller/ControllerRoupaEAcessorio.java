package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import model.Dados;
import model.RoupaEAcessorio;
import model.Vendedor;
import view.ViewBusca;
import view.CadastraRoupaEAcessorio;
import view.DeletarRoupaEAcessorio;
import view.MenuRoupaEAcessorio;
import view.ViewCompra;
import view.ViewVenda;

/**
 * Controller responsavel pelas metodos dos produtos
 * @author Josue Teixeira Santana
 *
 */
public class ControllerRoupaEAcessorio {
	private CadastraRoupaEAcessorio view;
	private DeletarRoupaEAcessorio view2;
	private ViewBusca view4;
	private ViewCompra view5;
	private ControllerVenda view6;
	
	/** Faz a inicializacao da view
	 * 
	 * @param view3 recebe a view MenuRoupaEAcessorio
	 */


	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view CadastraRoupaEAcessorio
	 */
	public ControllerRoupaEAcessorio(CadastraRoupaEAcessorio view) {

		this.view = view;
	}
	
	/** Faz a inicializacao da view
	 * 
	 * @param view2 recebe a view DeletarRoupaEAcessorio
	 */
	public ControllerRoupaEAcessorio(DeletarRoupaEAcessorio view2) {

		this.view2 = view2;
	}

	/** Faz a inicializacao da view
	 * 
	 * @param view4 recebe a view BuscaRoupaEAcessorio
	 */
	public ControllerRoupaEAcessorio(ViewBusca view4) {
		this.view4 = view4;
	}

	/** Faz a inicializacao da view
	 * 
	 * @param view5 recebe a view ViewCompra
	 */
	public ControllerRoupaEAcessorio(ViewCompra view5) {
		this.view5 = view5;
	}

	/** Faz a inicializacao da view
	 * 
	 * @param view6 recebe a view ControllerVenda
	 */
	public ControllerRoupaEAcessorio(ControllerVenda view6) {
		this.view6 = view6;
	}

	/**
	 * Metodo responsavel pelo cadastro do produto,
	 * esse metodo recebe atraves de variaveis os dados que sao
	 * inseridos na view CadastraRoupaEAcessorio e os armazena em um
	 * array na classe dados
	 * @see Dados
	 * @see CadastraRoupaEAcessorio
	 */
	public void cadastrarRoupaEAcessorio() {

		String nome = view.getNomeTexto().getText();
		String categoria = view.getCategoriaTexto().getText();
		String modelo = view.getModeloTexto().getText();
		String tamanho = view.getTamanhoTexto().getText();
		String condicaoDeUso = view.getCondicaoDeUsoTexto().getText();
		Double preco = Double.parseDouble(view.getPrecoTexto().getText());
		String genero = view.getGeneroTexto().getText();
		String descricao = view.getDescricaoTexto().getText();
		
		Dados.getProducts().add(new RoupaEAcessorio(nome, categoria, modelo, tamanho, descricao, condicaoDeUso, preco, genero));
	}
	
    /**
     * Realiza uma busca pelos produtos cadastrados em Dados. Passa por uma verificação
     * de igualdade para verificar se os nomes sao iguais e caso for true
     * remove o produto da lista
     * 
     * @param nome nome do produto
     * @return Retorna true se a comparação for verdadeira ou false se caso não for
     * verdadeira.
     */
	public boolean removerRoupaEAcessorio(String nome) {
		 for (RoupaEAcessorio productLista : Dados.getProducts()) {
	            if (verificarIgualdade(nome)) {
	                Dados.getProducts().remove(productLista);
	                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
	                return true;
	            }
		 }
		 JOptionPane.showMessageDialog(null, "Nao foi possivel excluir essa conta", null, JOptionPane.INFORMATION_MESSAGE);
	     return false;
	}
	
    /**
     * Metodo que verifica se o nome inserido no parametro
     * e igual ao nome no array da classe Dados, se verdadeiro
     * retorna true, caso contrario retorna false
     * @param name nome do produto
     * @return true caso verdadeiro, false caso contrario
     */
	 public boolean verificarIgualdade(String name) {
	    	
	        for (RoupaEAcessorio product : Dados.getProducts()) {
	            if (product.getNome().equals(name)) {
	                return true;
	            }
	        }
	        return false;
	    }
	
	    /**
	     * Gera um novo array de produto quando cadastrado
	     * 
	     * @return array atualizada de produto
	     */
	public String[] verProduto() {
		
		List<String> nArrayProduto = new ArrayList<>();
		
		for (RoupaEAcessorio product : Dados.getProducts()) {
			nArrayProduto.add(product.getNome());
		}
		
		return nArrayProduto.toArray(new String[0]);
	}
	
    /**
     * Atualiza a lista de produto utilizando o comboBox,
     * quando um novo produto for cadastrado
     * 
     * @return retorna um novo comboBox
     */
    public DefaultComboBoxModel<String> atualizarProduto() {
    	
        return new DefaultComboBoxModel<>(verProduto());
    }
    
	/**
     * Procura dentro da array, de produtos inseridos na classe Dados, o
     * nome do produto que queremos buscar
     * 
     * @param name Parametro que recebe o nome a ser buscado
     * @return Retorna os dados do produto cadastrado (true), se o encontrar,
     * caso contrário ele no retorna null
     */
    public RoupaEAcessorio buscarRoupaEAcessorio(String name) {
        for (RoupaEAcessorio produtoSelecionado : Dados.getProducts()) {
            if (produtoSelecionado.getNome().equals(name)) {
                return produtoSelecionado;
            }
        }

        return null;
    }
}
