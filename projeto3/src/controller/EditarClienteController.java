package controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import view.EditarCliente;
import view.MenuContaCliente;

/**
 * Controller responsavel pela execucao das acoes do botao editar
 * na view EditarCliente
 * @author Josue Teixeira Santana
 *
 */
public class EditarClienteController {

	private final EditarCliente view;
	
	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view EditarCliente
	 */
    public EditarClienteController(EditarCliente view) {
        this.view = view;
    }

    /**
     * Quando o botao editar e acionado na view MenuContaCliente ela troca 
     * os valores do nome,cpf,endereco e telefone utilizando o metodo set
     * para cada um. E volta para o menu da conta do cliente
     * @param e recebe a acao que sera executada
     */
	public void executarBotao(JButton e) {
		if (e == view.getConfirmarBtn()) {

            String name = view.getNomeTexto().getText();
            String cpf = view.getCpfTexto().getText();
            String endereco = view.getEnderecoTexto().getText();
            String telefone = view.getTelefoneTexto().getText();
       

            this.view.getCliente().setNome(name);
            this.view.getCliente().setCpf(cpf);
            this.view.getCliente().setEndereco(endereco);
            this.view.getCliente().setTelefone(telefone);
            

            JOptionPane.showMessageDialog(null, "As informacoes do cliente foram alteradas com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            new MenuContaCliente();
            view.getJanelaEditarCliente().setVisible(false);

        } else {
        	new MenuContaCliente();
            view.getJanelaEditarCliente().setVisible(false);
        }
	
		
	}
}
