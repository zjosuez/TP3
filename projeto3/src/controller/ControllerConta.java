package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

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
	
    /**
     * Realiza uma busca pelos clientes cadastrados em Dados. Passa por uma verificação
     * pelo if, puxando o método sãoIguais, que do qual vai comparar o parâmetro do
     * nome do cliente com os que já estão cadastrados.
     * 
     * @param name Nome do cliente
     * @return Retorna true se a comparação for verdadeira ou false se caso não for
     * verdadeira.
     */
    public boolean excluirCliente(String name) {
        for (Cliente clienteLista : Dados.getCliente()) {
            if (verificarIgualdade(name)) {
                Dados.getCliente().remove(clienteLista);
                JOptionPane.showMessageDialog(null, "Conta excluida com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }

        JOptionPane.showMessageDialog(null, "Nao foi possivel excluir essa conta", null, JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
    
    private boolean verificarIgualdade(String name) {
    	
        for (Cliente cliente : Dados.getCliente()) {
            if (cliente.getNome().equals(name)) {
                return true;
            }
        }
        return false;
    }
	
	public void executaBotao(Object e) {

        if (e == view.getExcluirBtn()) {
        	
            excluirCliente((String)view.getBuscarCliente().getSelectedItem());
            this.view.dispose();
            new MenuCliente();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        if (e == view.getVoltarBtn()) {
            
            new MenuCliente();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        else if (e == view.getMostrarDetalhes()) {
        	
            view.getAreaTexto().setText(((this.buscarClienteEscolhido((String)view.getBuscarCliente().getSelectedItem())).toString()));
            view.getAreaTexto().updateUI();
        } 
        
        if (e == view.getEditarBtn()) {
        	
            new EditarCliente(buscarClienteEscolhido(view.getBuscarCliente().getSelectedItem().toString())).setVisible(true);
            view.getJanelaViewConta().setVisible(false);
           
        } 
    }
}
