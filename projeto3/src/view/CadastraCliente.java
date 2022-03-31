package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControllerCliente;
import model.Dados;

public class CadastraCliente extends JFrame implements ActionListener{
	
	private final ControllerCliente controller;
	private final JFrame janelaCadastraCliente;
	private final JLabel tituloCadastraCliente;
	private final JLabel nomeCliente;
	private final JLabel cpfCliente;
	private final JLabel enderecoCliente;
	private final JLabel telefoneCliente;
	private final JTextField nomeTexto;
	private final JTextField cpfTexto;
	private final JTextField enderecoTexto;
	private final JTextField telefoneTexto;
	private final JButton cadastrarbtn;
	private final JButton voltarbtn;
	
	public CadastraCliente() {
		
		controller = new ControllerCliente(this);
		
		// Criando o JFrame
		janelaCadastraCliente = new JFrame("Menu Cadastro Cliente");
		
		// titulo da janela
		tituloCadastraCliente = new JLabel("Cadastro De Clientes");
		tituloCadastraCliente.setFont(new Font("Arial", Font.BOLD, 18));
		tituloCadastraCliente.setBounds(168,19,245,30);
		janelaCadastraCliente.add(tituloCadastraCliente);
		
		// Label do nome
		nomeCliente = new JLabel("Nome");
		nomeCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		nomeCliente.setBounds(20, 70, 154, 14);
		janelaCadastraCliente.add(nomeCliente);
		
		// Label do CPF
		cpfCliente = new JLabel("CPF");
		cpfCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		cpfCliente.setBounds(20, 120, 154, 15);
		janelaCadastraCliente.add(cpfCliente);
		
		// Label do Endereco
		enderecoCliente = new JLabel("Endereco");
		enderecoCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		enderecoCliente.setBounds(20, 170, 154, 14);
		janelaCadastraCliente.add(enderecoCliente);
		
		// Label do telefone
		telefoneCliente = new JLabel("Telefone");
		telefoneCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		telefoneCliente.setBounds(20, 220, 154, 14);
		janelaCadastraCliente.add(telefoneCliente);
		
		// Criacao da JText nome
		nomeTexto = new JTextField();
		nomeTexto.setColumns(10);
		nomeTexto.setBounds(20, 95, 250, 22);
		janelaCadastraCliente.add(nomeTexto);
		
		// Criando JText CPF
		cpfTexto = new JTextField();
		cpfTexto.setColumns(10);
		cpfTexto.setBounds(20, 145, 250, 22);
		janelaCadastraCliente.add(cpfTexto);
		
		// Criando JText Endereco
		enderecoTexto = new JTextField();
		enderecoTexto.setColumns(10);
		enderecoTexto.setBounds(20, 195, 250, 22);
		janelaCadastraCliente.add(enderecoTexto);
		
		// Criando JText telefone
		telefoneTexto = new JTextField();
		telefoneTexto.setColumns(10);
		telefoneTexto.setBounds(20, 245, 250, 22);
		janelaCadastraCliente.add(telefoneTexto);
		
		// Criando JButton cadastrar
		cadastrarbtn = new JButton("Cadastrar");
		cadastrarbtn.setBounds(325,110,180,50);
		cadastrarbtn.addActionListener(this);
		janelaCadastraCliente.add(cadastrarbtn);
		
		// Criando JButton cancelar
		voltarbtn = new JButton("Voltar");
		voltarbtn.setBounds(325, 200, 180, 50);
		voltarbtn.addActionListener(this);
		janelaCadastraCliente.add(voltarbtn);
		
		// criacao do jframe
		janelaCadastraCliente.setLayout(null);
		janelaCadastraCliente.setSize(575, 400);
		janelaCadastraCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCadastraCliente.setVisible(true);
		janelaCadastraCliente.setResizable(false);
				
	}
		
		// Getter and Setters
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

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == cadastrarbtn) {
				controller.CadastrarCliente();
				JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
				new MenuCliente();
				janelaCadastraCliente.setVisible(false);
			}
			
			if(src == voltarbtn) {
				
				new MenuCliente();
				janelaCadastraCliente.setVisible(false);
			}
	}
}
