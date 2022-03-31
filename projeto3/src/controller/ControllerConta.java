package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Cliente;
import model.Dados;
import view.EditarCliente;
import view.MenuCliente;
import view.MenuConta;

public class ControllerConta {
	
	private final MenuConta view;

	public ControllerConta(MenuConta view) {
		
		this.view = view;	
	}
	
	/**
     * Procura dentro da array, de clientes inseridos na classe Dados, o
     * nome do cliente que queremos buscar
     * 
     * @param name que iremos utilizar como parâmetro
     * @return os dados do nosso cliente cadastrado para caso achar,
     * caso contrário ele nos retorna null
     */
    public Cliente buscarClienteEscolhido(String name) {
        for (Cliente clienteAgora : Dados.getCliente()) {
            if (clienteAgora.getNome().equals(name)) {
                return clienteAgora;
            }
        }

        return null;
    }

    /**
     * Sempre atualizar o comboBox de clientes
     * quando um novo cliente for cadastrado
     * 
     * @return um novo comboBox atualizado
     */
    public DefaultComboBoxModel<String> atualizarClientes() {
        return new DefaultComboBoxModel<>(arraysClientes());
    }

    /**
     * Gera sempre uma array nova de clientes
     * quando um novo cliente é cadastrado
     * 
     * @return array atualizada de clientes
     */
    public String[] arraysClientes() {
        List<String> modelo = new ArrayList<>();

        for (Cliente cliente : Dados.getCliente()) {
            modelo.add(cliente.getNome());
        }

        return modelo.toArray(new String[0]);
    }
	
	
	public void executaBotao(Object botao) {

//        if (botao == view.getExcluirBtn()) {
//            excluirCliente((String)view.getBuscarClientesComboBox().getSelectedItem());
//            this.view.dispose();
//            new Login().setVisible(true);
//        } 
        
        if (botao == view.getVoltarBtn()) {
            
            new MenuCliente().setVisible(true);
            
        } 
        
//        else if (botao == view.getMostrarDetalhes()) {
//            view.getInformacoesTable().setText(((this.buscarClienteEscolhido((String)view.getBuscarClientesComboBox().getSelectedItem())).toString()));
//            view.getInformacoesTable().updateUI();
//        } 
        
        if (botao == view.getEditarBtn()) {
            new EditarCliente(buscarClienteEscolhido(view.getBuscarCliente().getSelectedItem().toString())).setVisible(true);
            this.view.setVisible(false);
           
        } 
        
//        else {
//            clienteBusca = buscarClienteEscolhido(view.getBuscarClientesComboBox().getSelectedItem().toString());
//
//            Cliente modelo = telaCliente.pegarModelo();
//        }
    }
}
