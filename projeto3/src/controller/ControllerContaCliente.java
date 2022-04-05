package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import model.Cliente;
import model.Dados;
import view.EditarCliente;
import view.MenuCliente;
import view.MenuContaCliente;

/**
 * Controller responsavel pelos metodos referente a conta do cliente
 * @author Josue Teixeira Santana
 *
 */

public class ControllerContaCliente {
	
	private final MenuContaCliente view;

	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view MenuContaCliente
	 */
	public ControllerContaCliente(MenuContaCliente view) {
		
		this.view = view;	
	}
	
	/**
     * Faz a busca pelo nome do cliente no array que
     * esta armazenado na classe Dados
     * @param name nome do cliente que queremos procurar
     * @return os dados do nosso cliente cadastrado caso contrario retorna null
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
     * Atualiza a lista de clientes utilizando o comboBox
     * quando um novo cliente for cadastrado
     * 
     * @return retorna um novo comboBox
     */
    public DefaultComboBoxModel<String> atualizarClientes() {
        return new DefaultComboBoxModel<>(arraysClientes());
    }

    /**
     * Gera um novo array de cliente quando cadastrado
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
     * de igualdade para verificar se os nomes sao iguais e caso for true
     * remove o cliente da lista
     * 
     * @param name nome do cliente
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
    
    /**
     * Metodo que verifica se o nome inserido no parametro
     * e igual ao nome no array da classe Dados, se verdadeiro
     * retorna true, caso contrario retorna false
     * @param name nome do cliente
     * @return true caso verdadeiro, false caso contrario
     */
    private boolean verificarIgualdade(String name) {
    	
        for (Cliente cliente : Dados.getCliente()) {
            if (cliente.getNome().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Executa uma acao caso  o objeto e seja pressionado
     * (1) Caso seja o botao excluir, chama o metodo excluirCliente e executa a acao
     * (2) Caso seja o botao voltar, volta para a tela da conta
     * (3) Caso seja o botao mostrar detalhes, mostra os dados da conta
     * (4) Caso seja o botao editar, edita os dados do usuario
     * @param e parametro que recebe a acao na view
     */
	public void executaBotao(Object e) {

        if (e == view.getExcluirBtn()) {
        	
            excluirCliente((String)view.getBuscarCliente().getSelectedItem());
            new MenuCliente();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        if (e == view.getVoltarBtn()) {
            
            new MenuCliente();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        if (e == view.getMostrarDetalhes()) {
        	
            view.getAreaTexto().setText(((this.buscarClienteEscolhido((String)view.getBuscarCliente().getSelectedItem())).toString()));
            view.getAreaTexto().updateUI();
        } 
        
        if (e == view.getEditarBtn()) {
        	
            new EditarCliente(buscarClienteEscolhido(view.getBuscarCliente().getSelectedItem().toString())).setVisible(true);
            view.getJanelaViewConta().setVisible(false);
           
        } 
    }
}
