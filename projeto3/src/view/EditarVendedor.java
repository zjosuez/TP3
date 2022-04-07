package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.EditarVendedorController;
import model.Vendedor;

/**
 * Classe responsavel por editar os dados do vendedor.
 * recebe todos os dados referente ao vendedor e faz a edicao deles
 * 
 * @author Josue Teixeira Santana
 */
public class EditarVendedor extends JFrame implements ActionListener{

	private final Vendedor vendedor;
	private final JFrame janelaEditarVendedor;
	private final JLabel tituloEditarVendedor;
	private final JLabel nomeVendedor;
	private final JLabel cpfVendedor;
	private final JLabel enderecoVendedor;
	private final JLabel telefoneVendedor;
	private final JTextField nomeTexto;
	private final JTextField cpfTexto;
	private final JTextField enderecoTexto;
	private final JTextField telefoneTexto;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final EditarVendedorController controller;
	
	/**
	 * Metodo que cria todas as Jlabels, JTextField... interface no geral.
	 * recebe os seguintes dados: nome, cpf, endereco, telefone e faz a
	 * edicao deles.
	 * 
	 * @see MenuContaCliente
	 */
	public EditarVendedor(Vendedor vendedor) {
		
		controller = new EditarVendedorController(this);
        this.vendedor = vendedor;
        
        janelaEditarVendedor= new JFrame("Menu editar");
        
        	// titulo da janela
     		tituloEditarVendedor = new JLabel("Editar Vendedor");
     		tituloEditarVendedor.setFont(new Font("Arial", Font.BOLD, 18));
     		tituloEditarVendedor.setBounds(168,19,245,30);
     		janelaEditarVendedor.add(tituloEditarVendedor);
     		
     		// Label do nome
     		nomeVendedor = new JLabel("Nome");
     		nomeVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
     		nomeVendedor.setBounds(20, 70, 154, 14);
     		janelaEditarVendedor.add(nomeVendedor);
     		
     		// Label do CPF
     		cpfVendedor = new JLabel("CPF");
     		cpfVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
     		cpfVendedor.setBounds(20, 120, 154, 15);
     		janelaEditarVendedor.add(cpfVendedor);
     		
     		// Label do Endereco
     		enderecoVendedor = new JLabel("Endereco");
     		enderecoVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
     		enderecoVendedor.setBounds(20, 170, 154, 14);
     		janelaEditarVendedor.add(enderecoVendedor);
     		
     		// Label do telefone
     		telefoneVendedor = new JLabel("Telefone");
     		telefoneVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
     		telefoneVendedor.setBounds(20, 220, 154, 14);
     		janelaEditarVendedor.add(telefoneVendedor);
     		
     	// Criacao da JText nome
    		nomeTexto = new JTextField(vendedor.getNome());
    		nomeTexto.setColumns(10);
    		nomeTexto.setBounds(20, 95, 250, 22);
    		janelaEditarVendedor.add(nomeTexto);
    		
    		// Criando JText CPF
    		cpfTexto = new JTextField(vendedor.getCpf());
    		cpfTexto.setColumns(10);
    		cpfTexto.setBounds(20, 145, 250, 22);
    		janelaEditarVendedor.add(cpfTexto);
    		
    		// Criando JText Endereco
    		enderecoTexto = new JTextField(vendedor.getEndereco());
    		enderecoTexto.setColumns(10);
    		enderecoTexto.setBounds(20, 195, 250, 22);
    		janelaEditarVendedor.add(enderecoTexto);
    		
    		// Criando JText telefone
    		telefoneTexto = new JTextField(vendedor.getTelefone());
    		telefoneTexto.setColumns(10);
    		telefoneTexto.setBounds(20, 245, 250, 22);
    		janelaEditarVendedor.add(telefoneTexto);
    		
    		// Criando JButton cadastrar
    		confirmarBtn = new JButton("Confirmar");
    		confirmarBtn.setBounds(325,110,180,50);
    		confirmarBtn.addActionListener(this);
    		janelaEditarVendedor.add(confirmarBtn);
    		
    		// Criando JButton cancelar
    		voltarBtn = new JButton("Voltar");
    		voltarBtn.setBounds(325, 200, 180, 50);
    		voltarBtn.addActionListener(this);
    		janelaEditarVendedor.add(voltarBtn);
    		
    		// criacao do jframe
    		janelaEditarVendedor.setLayout(null);
    		janelaEditarVendedor.setSize(575, 400);
    		janelaEditarVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		janelaEditarVendedor.setVisible(true);
    		janelaEditarVendedor.setResizable(false);
		
	}
	
	public JFrame getJanelaEditarVendedor() {
		return janelaEditarVendedor;
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
	
	public Vendedor getVendedor() {
		return vendedor;
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
