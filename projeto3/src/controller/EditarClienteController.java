package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Cliente;
import model.Dados;
import view.EditarCliente;
import view.MenuCliente;
import view.EditarCliente;

public class EditarClienteController {

	private final EditarCliente view;

    public EditarClienteController(EditarCliente view) {
        this.view = view;
    }

	public void executarBotao(JButton source) {
		if (source == view.getConfirmarBtn()) {

            String name = view.getNomeTexto().getText();
            String cpf = view.getCpfTexto().getText();
            String endereco = view.getEnderecoTexto().getText();
            String telefone = view.getTelefoneTexto().getText();
       

            this.view.getCliente().setNome(name);
            this.view.getCliente().setCpf(cpf);
            this.view.getCliente().setEndereco(endereco);
            this.view.getCliente().setTelefone(telefone);
            

            JOptionPane.showMessageDialog(null, "As informcoes do cliente foram alteradas com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            new MenuCliente();
            this.view.dispose();

        }
		
	}
}
