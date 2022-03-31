package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.RoupaEAcessorio;
import view.CadastraRoupaEAcessorio;
import view.DeletarRoupaEAcessorio;

public class ControllerRoupaEAcessorio {
	private CadastraRoupaEAcessorio view;
	private DeletarRoupaEAcessorio view2;

	public ControllerRoupaEAcessorio(CadastraRoupaEAcessorio view) {

		this.view = view;
	}
	
	public ControllerRoupaEAcessorio(DeletarRoupaEAcessorio view2) {

		this.view2 = view2;
	}

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
	
	public void removerRoupaEAcessorio() {
	
	}
	
	/**
     * Metodo para inserir em um novo array 
     * o nome do produto cadastrado.
     * 
     * @return novo array com o nome dos produtos cadastrados
     */
	public String[] verProduto() {
		
		List<String> nArrayProduto = new ArrayList<>();
		
		for (RoupaEAcessorio product : Dados.getProducts()) {
			nArrayProduto.add(product.getNome());
		}
		
		return nArrayProduto.toArray(new String[0]);
	}
	
	/**
     * Método para que possa atualizar o ComboBox sempre
     * quando um novo produto é cadastrado
     * 
     * @return um comboBox atualizado com a seleção dos produtos
     */
    public DefaultComboBoxModel<String> atualizarProduto() {
    	
        return new DefaultComboBoxModel<>(verProduto());
    }
    
    /**
     * Nesse método ele busca pelo produto que foi selecionado
     * no ComboBox e imprime as informações dele
     * 
     * @param name Nome do produto
     * @return null caso não encontre nada
     */
    public RoupaEAcessorio buscarRoupaEAcessorio(String name) {
        for (RoupaEAcessorio produtoSelecionado : Dados.getProducts()) {
            if (produtoSelecionado.getNome().equals(name)) {
                return produtoSelecionado;
            }
        }

        return null;
    }

	public void executarBotao(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
