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
import model.Cliente;

/**
 * Classe responsavel pela selecao da acao do cliente
 * 
 * @author Josue Teixeira Santana
 */
public class MenuContaCliente extends JFrame implements ActionListener{
	
	private final ControllerContaCliente controller;
	private final JFrame janelaViewConta;
	private final JLabel tituloViewConta;
	private JTextArea areaTexto;
	private JComboBox<String> buscarCliente;
	private JButton excluirBtn;
	private JButton voltarBtn;	
	private JButton editarBtn;
	private JButton mostrarDetalhesBtn;
	
	/**
	 * Metodo que cria toda a interface de interacao com o usuario.
	 * Leva o usuario ate a view ou acao que dejesa realizar 
	 * 
	 * @see EditarCliente
	 */
	public MenuContaCliente() {
		
		Cliente cliente = new Cliente("", "", "", "");
		controller = new ControllerContaCliente(this);
		
		// Janela 
		janelaViewConta = new JFrame("Menu Conta");
		
		// titulo da janela
		tituloViewConta = new JLabel("Conta");
		tituloViewConta.setFont(new Font("Arial", Font.BOLD, 18));
		tituloViewConta.setBounds(260,10,245,30);
		janelaViewConta.add(tituloViewConta);
		
		// box de area texto
		areaTexto = new JTextArea(cliente.toString());
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
		buscarCliente = new JComboBox<>();
		buscarCliente.setBounds(10, 60, 170, 22);
		buscarCliente.setModel(controller.atualizarClientes());
		janelaViewConta.add(buscarCliente);
		buscarCliente.addItem("Selecionar Clientes");
		
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

	public JButton getMostrarDetalhes() {
		return mostrarDetalhesBtn;
	}

	public JComboBox<String> getBuscarCliente() {
		return buscarCliente;
	}

	public JFrame getJanelaViewConta() {
		return janelaViewConta;
	}

	public ControllerContaCliente getController() {
		return controller;
	}

	/**
	 * Executa a acao quando um botao e pressionado.
	 * Chama a controller para realizar a acao
	 * 
	 * @see ControllerContaCliente
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		this.controller.executaBotao(e.getSource());
	
	}

}
