package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.RoupaEAcessorio;
import model.Venda;
import view.CadastraRoupaEAcessorio;
import view.MenuCliente;
import view.ViewCompra;
import view.ViewVenda;

/**
 * Controller responsavel pelo cadastro da venda na classe dados
 * e tambem possui metodos de calculo e busca de preco
 * @author Josué Teixeira Santana
 *
 */
public class ControllerVenda {
	private ViewCompra view2;
	private ViewVenda view;
	private ControllerRoupaEAcessorio controller;
	private Object receberProduto;

	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view ViewVenda
	 */
	public ControllerVenda(ViewVenda view) {
		this.view = view;
	}

	/**
	 * Contrutor da classe recebendo a controller ControllerRoupaEAcessorio
	 * @see ControllerRoupaEAcessorio
	 */
	public ControllerVenda() {
		
		controller = new ControllerRoupaEAcessorio(this);
	}
	
	/** Faz a inicializacao da view
	 * 
	 * @param view2 recebe a view ViewCompra
	 */
	 public ControllerVenda(ViewCompra view2) {
		this.view2 = view2;
	}
	 
	 /**
	  * Metodo responsavel pelo cadastro da venda,
	  * esse metodo recebe atraves de variaveis os dados que sao
	  * inseridos na view ViewVenda e os armazena em um
	  * array na classe dados
	  * @see Dados
	  * @see ViewVenda
	  */
	public void cadastrarVenda() {
		
		Object produto = getReceberProduto();
		int qtdProduto = (int) view.getQtdProdutoTexto().getSelectedItem();
		String formaPagamento = view.getFormaDePagamentoTexto().getText();
		double preco =  view.getProduto();
		
		Dados.getDadosvenda().add(new Venda(produto, qtdProduto, formaPagamento, preco));
	}

	/**
     * Procura dentro da array, de produtos inseridos na classe Dados, o
     * nome do produto que queremos buscar, depois ele passa por uma condicao
     * caso encontre o produto ele retorna o preco associado a esse produto
     * 
     * @param name Parametro que recebe o nome a ser buscado
     * @return Retorna o preco do produto cadastrado caso seja true,
     * caso contrário ele retorna null
     */
	public Double buscarPreco(String name) {
	        for (RoupaEAcessorio produtoSelecionado : Dados.getProducts()) {
	            if (produtoSelecionado.getNome().equals(name)) {
	                return produtoSelecionado.getPreco();
	            }
	        }

	        return null;
	    }
	
    /**
     * Atualiza a lista de produto utilizando o comboBox,
     * 
     * @return retorna um novo comboBox de produto
     */
	 public DefaultComboBoxModel<String> atualizarProduto() {
	    	
	        return new DefaultComboBoxModel<>(verProduto());
	    }
	 
	 /**
	  * Gera um novo array e a cada interacao o novo array recebe
	  * os dados do produto 
	  * 
	  * @return novo array atualizado de produto
	  */
	 public String[] verProduto() {
			
			List<String> nArrayProduto = new ArrayList<>();
			
			for (RoupaEAcessorio product : Dados.getProducts()) {
				nArrayProduto.add(product.getNome());
			}
			
			return nArrayProduto.toArray(new String[0]);
		}
	 
	 /**
	  * Esse metodo recebe a quantidade atraves do comboBox
	  * e multiplica pelo valor do parametro para calcular o preco total do produto
	  * 
	  * @param valor - double
	  * @return - double 
	  */
	 public Double calculoTotal(Double valor) {
		 
		 Integer quantidade = Integer.valueOf((Integer) view.getQtdProdutoTexto().getSelectedIndex()) + 1;
		 Double resultado = valor * quantidade;
		 return resultado;
	 }
	 
	 public Object getReceberProduto() {
		return receberProduto;
	}

	public void setReceberProduto(Object receberProduto) {
		this.receberProduto = receberProduto;
	}

	/**
	  * Executa uma acao caso o objeto e seja acionado
	  * (1) Caso seja o botao comprar, chama a view ViewVenda faz uma busca pelo preco
	  * que tem como parametro o valor selecionado
	  * (2) Caso seja o botao voltar, volta para a tela do menu do cliente
	  * @param src - parametro que recebe a acao na view
	  */
	 public void executaBotao(Object src) {
			
			if (src == view2.getComprarBtn()) {
				
				new ViewVenda(buscarPreco(view2.getProdutoComboBox().getSelectedItem().toString()));
				this.view2.getJanelaVenda().setVisible(false);
			}
			
			if (src == view2.getVoltarBnt()) {
				
				new MenuCliente();
				this.view2.getJanelaVenda().setVisible(false);
			}
			
		}
}
