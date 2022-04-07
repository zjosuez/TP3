package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditarClienteController;
import model.Cliente;

/**
 * Classe responsavel por editar os dados do cliente
 * recebe todos os dados referente ao cliente e faz a edicao deles
 * 
 * @author Josue Teixeira Santana
 */
public class EditarCliente extends JFrame implements ActionListener{

	private final Cliente cliente;
	private final JFrame janelaEditarCliente;
	private final JLabel tituloEditarCliente;
	private final JLabel nomeCliente;
	private final JLabel cpfCliente;
	private final JLabel enderecoCliente;
	private final JLabel telefoneCliente;
	private final JTextField nomeTexto;
	private final JTextField cpfTexto;
	private final JTextField enderecoTexto;
	private final JTextField telefoneTexto;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final EditarClienteController controller;
	
	/**
	 * Metodo que cria todas as Jlabels, JTextField... interface no geral,
	 * recebe os seguintes dados: nome, cpf, endereco, telefone e faz a
	 * edicao deles.
	 * 
	 * @see MenuContaCliente
	 */
	public EditarCliente(Cliente cliente) {
		
		controller = new EditarClienteController(this);
        this.cliente = cliente;
        
        janelaEditarCliente = new JFrame("Menu editar");
        
     // titulo da janela
     		tituloEditarCliente = new JLabel("Editar Cliente");
     		tituloEditarCliente.setFont(new Font("Arial", Font.BOLD, 18));
     		tituloEditarCliente.setBounds(168,19,245,30);
     		janelaEditarCliente.add(tituloEditarCliente);
     		
     		// Label do nome
     		nomeCliente = new JLabel("Nome");
     		nomeCliente.setFont(new Font("Arial", Font.PLAIN, 15));
     		nomeCliente.setBounds(20, 70, 154, 14);
     		janelaEditarCliente.add(nomeCliente);
     		
     		// Label do CPF
     		cpfCliente = new JLabel("CPF");
     		cpfCliente.setFont(new Font("Arial", Font.PLAIN, 15));
     		cpfCliente.setBounds(20, 120, 154, 15);
     		janelaEditarCliente.add(cpfCliente);
     		
     		// Label do Endereco
     		enderecoCliente = new JLabel("Endereco");
     		enderecoCliente.setFont(new Font("Arial", Font.PLAIN, 15));
     		enderecoCliente.setBounds(20, 170, 154, 14);
     		janelaEditarCliente.add(enderecoCliente);
     		
     		// Label do telefone
     		telefoneCliente = new JLabel("Telefone");
     		telefoneCliente.setFont(new Font("Arial", Font.PLAIN, 15));
     		telefoneCliente.setBounds(20, 220, 154, 14);
     		janelaEditarCliente.add(telefoneCliente);
     		
     		// Criacao da JText nome
    		nomeTexto = new JTextField(cliente.getNome());
    		nomeTexto.setColumns(10);
    		nomeTexto.setBounds(20, 95, 250, 22);
    		janelaEditarCliente.add(nomeTexto);
    		
    		// Criando JText CPF
    		cpfTexto = new JTextField(cliente.getCpf());
    		cpfTexto.setColumns(10);
    		cpfTexto.setBounds(20, 145, 250, 22);
    		janelaEditarCliente.add(cpfTexto);
    		
    		// Criando JText Endereco
    		enderecoTexto = new JTextField(cliente.getEndereco());
    		enderecoTexto.setColumns(10);
    		enderecoTexto.setBounds(20, 195, 250, 22);
    		janelaEditarCliente.add(enderecoTexto);
    		
    		// Criando JText telefone
    		telefoneTexto = new JTextField(cliente.getTelefone());
    		telefoneTexto.setColumns(10);
    		telefoneTexto.setBounds(20, 245, 250, 22);
    		janelaEditarCliente.add(telefoneTexto);
    		
    		// Criando JButton cadastrar
    		confirmarBtn = new JButton("Confirmar");
    		confirmarBtn.setBounds(325,110,180,50);
    		confirmarBtn.addActionListener(this);
    		janelaEditarCliente.add(confirmarBtn);
    		
    		// Criando JButton cancelar
    		voltarBtn = new JButton("Voltar");
    		voltarBtn.setBounds(325, 200, 180, 50);
    		voltarBtn.addActionListener(this);
    		janelaEditarCliente.add(voltarBtn);
    		
    		// criacao do jframe
    		janelaEditarCliente.setLayout(null);
    		janelaEditarCliente.setSize(575, 400);
    		janelaEditarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		janelaEditarCliente.setVisible(true);
    		janelaEditarCliente.setResizable(false);
	}


	public Cliente getCliente() {
		return cliente;
	}


	public JFrame getJanelaEditarCliente() {
		return janelaEditarCliente;
	}


	public JLabel getTituloEditarCliente() {
		return tituloEditarCliente;
	}


	public JLabel getNomeCliente() {
		return nomeCliente;
	}


	public JLabel getCpfCliente() {
		return cpfCliente;
	}


	public JLabel getEnderecoCliente() {
		return enderecoCliente;
	}


	public JLabel getTelefoneCliente() {
		return telefoneCliente;
	}


	public JTextField getNomeTexto() {
		return nomeTexto;
	}


	public JTextField getCpfTexto() {
		return cpfTexto;
	}


	public JTextField getEnderecoTexto() {
		return enderecoTexto;
	}


	public JTextField getTelefoneTexto() {
		return telefoneTexto;
	}


	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}


	public JButton getVoltarBtn() {
		return voltarBtn;
	}


	public EditarClienteController getController() {
		return controller;
	}

	/**
	 * Executa a acao quando um botao e pressionado.
	 * Chama a controller para realizar a acao
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao((JButton)e.getSource());
	}
}
