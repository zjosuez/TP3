package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.RoupaEAcessorio;
import view.MenuCliente;
import view.ViewCompra;
import view.ViewVenda;

public class ControllerVenda {
	private ViewCompra view2;
	private ViewVenda view;
	private ControllerRoupaEAcessorio controller;

	public ControllerVenda(ViewVenda view) {
		this.view = view;
	}

	public ControllerVenda() {
		
		controller = new ControllerRoupaEAcessorio(this);
//		buscarPreco(view2.getProdutoComboBox().toString());
	}
	 public ControllerVenda(ViewCompra view2) {
		this.view2 = view2;
	}

	public Double buscarPreco(String name) {
	        for (RoupaEAcessorio produtoSelecionado : Dados.getProducts()) {
	            if (produtoSelecionado.getNome().equals(name)) {
	                return produtoSelecionado.getPreco();
	            }
	        }

	        return null;
	    }
	
	 public DefaultComboBoxModel<String> atualizarProduto() {
	    	
	        return new DefaultComboBoxModel<>(verProduto());
	    }
	 
	 public String[] verProduto() {
			
			List<String> nArrayProduto = new ArrayList<>();
			
			for (RoupaEAcessorio product : Dados.getProducts()) {
				nArrayProduto.add(product.getNome());
			}
			
			return nArrayProduto.toArray(new String[0]);
		}
	 
	 public void executaBotao(Object botao) {
			
			if (botao == view2.getComprarBtn()) {
				
				new ViewVenda(buscarPreco(view2.getProdutoComboBox().getSelectedItem().toString()));
				this.view2.setVisible(false);
			}
			
			if (botao == view2.getVoltarBnt()) {
				
				new MenuCliente();
				this.view2.getJanelaVenda().setVisible(false);
			}
			
		}
}
