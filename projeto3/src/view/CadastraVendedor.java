package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControllerVendedor;

/**
 * Classe responsavel pela view de cadastro de Vendedor
 * recebe todos os dados referente ao produto atraves de uma
 * JTextField e executa os comandos quando os botoes sao pressionados
 * 
 * @author Josue Teixeira Santana
 */
public class CadastraVendedor extends JFrame implements ActionListener{

	private final ControllerVendedor controller;
	private final JFrame janelaCadastraVendedor;
	private final JLabel tituloCadastraVendedor;
	private final JLabel nomeVendedor;
	private final JLabel cpfVendedor;
	private final JLabel enderecoVendedor;
	private final JLabel telefoneVendedor;
	private final JTextField nomeTexto;
	private final JTextField cpfTexto;
	private final JTextField enderecoTexto;
	private final JTextField telefoneTexto;
	private final JComboBox<String> buscarProduto;
	private final JButton cadastrarbtn;
	private final JButton voltarbtn;
	
	/**
	 * Metodo que cria todas as Jlabels, JTextField... interface no geral,
	 * recebe os seguintes dados do usuario: nome, cpf, endereco, telefone.
	 * Esse metodo cria ainda dois botoes que sao responsaveis pela execucao
	 * do metodo e um comboBox que recebe os produtos associado ao vendedor
	 * 
	 * @see MenuVendedor
	 */
	public CadastraVendedor() {
		
		controller = new ControllerVendedor(this);
		
		// Criando o JFrame
		janelaCadastraVendedor = new JFrame("Menu Cadastro Vendedor");
		
		// titulo da janela
		tituloCadastraVendedor = new JLabel("Cadastro De Vendedores");
		tituloCadastraVendedor.setFont(new Font("Arial", Font.BOLD, 18));
		tituloCadastraVendedor.setBounds(174,19,245,30);
		janelaCadastraVendedor.add(tituloCadastraVendedor);
		
		// Label do nome
		nomeVendedor = new JLabel("Nome");
		nomeVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
		nomeVendedor.setBounds(20, 70, 154, 14);
		janelaCadastraVendedor.add(nomeVendedor);
		
		// Label do CPF
		cpfVendedor = new JLabel("CPF");
		cpfVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
		cpfVendedor.setBounds(20, 140, 154, 15);
		janelaCadastraVendedor.add(cpfVendedor);
		
		// Label do Endereco
		enderecoVendedor = new JLabel("Endereco");
		enderecoVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
		enderecoVendedor.setBounds(20, 210, 154, 14);
		janelaCadastraVendedor.add(enderecoVendedor);
		
		// Label do telefone
		telefoneVendedor = new JLabel("Telefone");
		telefoneVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
		telefoneVendedor.setBounds(20, 280, 154, 14);
		janelaCadastraVendedor.add(telefoneVendedor);
		
		// Criacao da JText nome
		nomeTexto = new JTextField();
		nomeTexto.setColumns(10);
		nomeTexto.setBounds(20, 95, 250, 22);
		janelaCadastraVendedor.add(nomeTexto);
		
		// Criando JText CPF
		cpfTexto = new JTextField();
		cpfTexto.setColumns(10);
		cpfTexto.setBounds(20, 165, 250, 22);
		janelaCadastraVendedor.add(cpfTexto);
		
		// Criando JText Endereco
		enderecoTexto = new JTextField();
		enderecoTexto.setColumns(10);
		enderecoTexto.setBounds(20, 225, 250, 22);
		janelaCadastraVendedor.add(enderecoTexto);
		
		// Criando JText telefone
		telefoneTexto = new JTextField();
		telefoneTexto.setColumns(10);
		telefoneTexto.setBounds(20, 305, 250, 22);
		janelaCadastraVendedor.add(telefoneTexto);
		
		// comboBox
		buscarProduto = new JComboBox<>();
		buscarProduto.setBounds(315, 100, 215, 22);
		buscarProduto.setModel(controller.atualizarProduto());
		janelaCadastraVendedor.add(buscarProduto);
		buscarProduto.addItem("Selecionar Vendedor");
		buscarProduto.setSelectedIndex(0);
		
		// Criando JButton cadastrar
		cadastrarbtn = new JButton("Cadastrar");
		cadastrarbtn.setBounds(325,190,180,50);
		cadastrarbtn.addActionListener(this);
		janelaCadastraVendedor.add(cadastrarbtn);
		
		// Criando JButton voltar
		voltarbtn = new JButton("Voltar");
		voltarbtn.setBounds(325, 280, 180, 50);
		voltarbtn.addActionListener(this);
		janelaCadastraVendedor.add(voltarbtn);
		
		// criacao do jframe
		janelaCadastraVendedor.setLayout(null);
		janelaCadastraVendedor.setSize(600, 450);
		janelaCadastraVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCadastraVendedor.setVisible(true);
		janelaCadastraVendedor.setResizable(false);
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
	
	public JComboBox<String> getBuscarProduto() {
		return buscarProduto;
	}

	/**
	 * Executa o comando quando um botao e pressionado
	 * (1) Cadastrar - chama o metodo da ControllerVendedor que recebe os valores
	 * e cadastra um novo vendedor
	 * (2) Voltar - volta para a view anterior
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarbtn) {
			controller.CadastrarVendedor();
			JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			new MenuVendedor();
			janelaCadastraVendedor.setVisible(false);
		}
		
		if(src == voltarbtn) {
			
			new MenuVendedor();
			janelaCadastraVendedor.setVisible(false);
		}
	}
}
