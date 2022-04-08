package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import model.Vendedor;
import model.Dados;
import view.ViewBusca;
import view.CadastraRoupaEAcessorio;
import view.EditarVendedor;
import view.MenuVendedor;
import view.MenuContaVendedor;

/**
 * Controller responsavel pelas metodos da conta do vendedor
 * @author Josue Teixeira Santana
 *
 */
public class ControllerContaVendedor {
	
	private MenuContaVendedor view;
	private ViewBusca view2;
	private CadastraRoupaEAcessorio view3;
	
	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view MenuContaVendedor
	 */
	public ControllerContaVendedor(MenuContaVendedor view) {
		
		this.view = view;
	}

	/** Faz a inicializacao da view
	 * 
	 * @param view2 recebe a view MenuContaVendedor
	 */
	public ControllerContaVendedor(ViewBusca view2) {
		this.view2 = view2;
	}

	public ControllerContaVendedor(CadastraRoupaEAcessorio view3) {
		this.view3 = view3;
	}

	/**
     * Procura dentro da array, de vendedor inseridos na classe Dados, o
     * nome do vendedor que queremos buscar
     * 
     * @param name Parametro que recebe o nome a ser buscado
     * @return Retorna os dados do vendedor cadastrado (true), se o encontrar,
     * caso contrário ele no retorna null
     */
    public Vendedor buscarVendedorEscolhido(String name) {
        for (Vendedor VendedorAgora : Dados.getVendedor()) {
            if (VendedorAgora.getNome().equals(name)) {
                return VendedorAgora;
            }
        }

        return null;
    }

    /**
     * Atualiza a lista de vendedor utilizando o comboBox,
     * quando um novo vendedor for cadastrado
     * 
     * @return retorna um novo comboBox
     */
    public DefaultComboBoxModel<String> atualizarVendedor() {
        return new DefaultComboBoxModel<>(arraysVendedor());
    }

    /**
     * Gera um novo array de vendedor quando cadastrado
     * 
     * @return array atualizada de vendedor
     */
    public String[] arraysVendedor() {
        List<String> modelo = new ArrayList<>();

        for (Vendedor vendedor : Dados.getVendedor()) {
            modelo.add(vendedor.getNome());
        }

        return modelo.toArray(new String[0]);
    }
	
    /**
     * Realiza uma busca pelos vendedores cadastrados em Dados. Passa por uma verificação
     * de igualdade para verificar se os nomes sao iguais e caso for true
     * remove o vendedor da lista
     * 
     * @param name nome do vendedor
     * @return Retorna true se a comparação for verdadeira ou false se caso não for
     * verdadeira.
     */
    public boolean excluirVendedor(String name) {
        for (Vendedor vendedorLista : Dados.getVendedor()) {
            if (verificarIgualdade(name)) {
                Dados.getVendedor().remove(vendedorLista);
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
     * @param name nome do vendedor
     * @return true caso verdadeiro, false caso contrario
     */
    public boolean verificarIgualdade(String name) {
    	
        for (Vendedor vendedor : Dados.getVendedor()) {
            if (vendedor.getNome().equals(name)) {
                return true;
            }
        }
        return false;
    }
	
    /**
     * Executa uma acao caso  o objeto e seja pressionado
     * (1) Caso seja o botao excluir, chama o metodo excluirVendedor e executa a acao
     * (2) Caso seja o botao voltar, volta para a tela da conta
     * (3) Caso seja o botao mostrar detalhes, mostra os dados da conta
     * (4) Caso seja o botao editar, edita os dados do usuario
     * @param e parametro que recebe a acao na view
     */
	public void executaBotao(Object e) {

        if (e == view.getExcluirBtn()) {
        	
            excluirVendedor((String)view.getBuscarVendedor().getSelectedItem());
            new MenuVendedor();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        if (e == view.getVoltarBtn()) {
            
            new MenuVendedor();
            view.getJanelaViewConta().setVisible(false);
        } 
        
        else if (e == view.getMostrarDetalhesBtn()) {
        	
            view.getAreaTexto().setText(((this.buscarVendedorEscolhido((String)view.getBuscarVendedor().getSelectedItem())).toString()));
            view.getAreaTexto().updateUI();
        } 
        
        if (e == view.getEditarBtn()) {
        	
            new EditarVendedor(buscarVendedorEscolhido(view.getBuscarVendedor().getSelectedItem().toString())).setVisible(true);
            view.getJanelaViewConta().setVisible(false);
           
        } 
    }
}
