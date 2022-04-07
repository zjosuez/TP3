package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controller.ControllerContaCliente;
import controller.ControllerContaVendedor;
import model.Vendedor;

/**
 * Classe responsavel pela selecao da acao do vendedor
 * 
 * @author Josue Teixeira Santana
 */
public class MenuContaVendedor extends JFrame implements ActionListener{

	private final ControllerContaVendedor controller;
	private final JFrame janelaViewConta;
	private final JLabel tituloViewConta;
	private JTextArea areaTexto;
	private JComboBox<String> buscarVendedor;
	private JButton excluirBtn;
	private JButton voltarBtn;	
	private JButton editarBtn;
	private JButton mostrarDetalhesBtn;
	
	/**
	 * Metodo que cria toda a interface de interacao com o usuario.
	 * Leva o usuario ate a view ou acao que dejesa realizar 
	 * 
	 * @see EditarVendedor
	 */
	public MenuContaVendedor() {
		
		Vendedor vendedor = new Vendedor("", "", "", "", null);
		controller = new ControllerContaVendedor(this);
		
		// Janela 
		janelaViewConta = new JFrame("Menu Conta");
				
		// titulo da janela
		tituloViewConta = new JLabel("Conta");
		tituloViewConta.setFont(new Font("Arial", Font.BOLD, 18));
		tituloViewConta.setBounds(260,10,245,30);
		janelaViewConta.add(tituloViewConta);
				
		// box de area texto
		areaTexto = new JTextArea(vendedor.toString());
		areaTexto.setBounds(10, 150, 300, 204);
		areaTexto.setEditable(false);
		janelaViewConta.add(areaTexto);
				
		// Criando JButton Mostrar detalhes
		mostrarDetalhesBtn = new JButton("Mostrar Detalhes");
		mostrarDetalhesBtn.setBounds(325,165,180,30);
		mostrarDetalhesBtn.addActionListener(this);
		janelaViewConta.add(mostrarDetalhesBtn);
						
		// Criando JButton excluir
		excluirBtn = new JButton("Excluir");
		excluirBtn.setBounds(325, 215, 180, 30);
		excluirBtn.addActionListener(this);
		janelaViewConta.add(excluirBtn);
				
		// Criando JButton editar
		editarBtn = new JButton("Editar");
		editarBtn.setBounds(325,265,180,30);
		editarBtn.addActionListener(this);
		janelaViewConta.add(editarBtn);
								
		// Criando JButton voltar
		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(325, 315, 180, 30);
		voltarBtn.addActionListener(this);
		janelaViewConta.add(voltarBtn);
				
		// Criando ComboBox
		buscarVendedor = new JComboBox<>();
		buscarVendedor.setBounds(10, 60, 230, 25);
		buscarVendedor.setModel(controller.atualizarVendedor());
		janelaViewConta.add(buscarVendedor);
		buscarVendedor.addItem("Selecionar Vendedor");
				
		// criacao do jframe
		janelaViewConta.setLayout(null);
		janelaViewConta.setSize(600, 500);
		janelaViewConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaViewConta.setVisible(true);
		janelaViewConta.setResizable(false);
	}

	public JTextArea getAreaTexto() {
		return areaTexto;
	}

	public JButton getExcluirBtn() {
		return excluirBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public JButton getEditarBtn() {
		return editarBtn;
	}

	public JButton getMostrarDetalhesBtn() {
		return mostrarDetalhesBtn;
	}
	
	public JFrame getJanelaViewConta() {
		return janelaViewConta;
	}

	public JComboBox<String> getBuscarVendedor() {
		return buscarVendedor;
	}

	/**
	 * Executa a acao quando um botao e pressionado.
	 * Chama a controller para realizar a acao
	 * 
	 * @see ControllerContaVendedor
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		this.controller.executaBotao(e.getSource());
	
	}
}
