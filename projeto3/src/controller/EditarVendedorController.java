package controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import view.EditarVendedor;
import view.MenuContaVendedor;

/**
 * Controller responsavel pela execucao das acoes do botao editar
 * na view EditarVendedor
 * @author Josue Teixeira Santana
 *
 */
public class EditarVendedorController {

	private final EditarVendedor view;
	
	/** Faz a inicializacao da view
	 * 
	 * @param view recebe a view EditarVendedor
	 */
    public EditarVendedorController(EditarVendedor view) {
        this.view = view;
    }

    /**
     * Quando o botao editar e acionado na view MenuContaVendedor ela troca 
     * os valores do nome,cpf,endereco e telefone utilizando o metodo set
     * para cada um. E volta para o menu da conta do vendedor
     * @param e recebe a acao que sera executada
     */
	public void executarBotao(JButton source) {
		if (source == view.getConfirmarBtn()) {

            String name = view.getNomeTexto().getText();
            String cpf = view.getCpfTexto().getText();
            String endereco = view.getEnderecoTexto().getText();
            String telefone = view.getTelefoneTexto().getText();
       

            this.view.getVendedor().setNome(name);
            this.view.getVendedor().setCpf(cpf);
            this.view.getVendedor().setEndereco(endereco);
            this.view.getVendedor().setTelefone(telefone);
            

            JOptionPane.showMessageDialog(null, "As informacoes do vendedor foram alteradas com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            new MenuContaVendedor();
            view.getJanelaEditarVendedor().setVisible(false);

        } else {
        	new MenuContaVendedor();
            view.getJanelaEditarVendedor().setVisible(false);
        }
	}
}
