package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuCliente extends JFrame implements ActionListener {

	private final JFrame janelaCliente;
	private final JLabel tituloMenuCliente;
	private final JButton cadastrarCliente;
	private final JButton mostrarContaCliente;
	private final JButton comprarProduto;
	private final JButton voltar;
	private final JButton buscarBtn;
	
	public MenuCliente() {
		tituloMenuCliente = new JLabel("Menu Cliente");
		tituloMenuCliente.setFont(new Font("Arial", Font.BOLD, 20));
		tituloMenuCliente.setBounds(179,17,245,30);
		
		// Cria botao cadastrar
		cadastrarCliente = new JButton("Cadastrar Cliente");
		cadastrarCliente.setBounds(145,80,200,40);
		cadastrarCliente.addActionListener(this);
		
		// Cria botao deletar
		mostrarContaCliente = new JButton("Mostrar Conta");
		mostrarContaCliente.setBounds(145,140,200,40);
		mostrarContaCliente.addActionListener(this);
		
		// Cria botao para comprar produto
		comprarProduto = new JButton("Comprar Produto");
		comprarProduto.setBounds(145,200,200,40);
		comprarProduto.addActionListener(this);
		
		// Cria botao voltar
		buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(145, 260, 200, 40);
		buscarBtn.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 320, 200, 40);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaCliente = new JFrame("Menu Roupa e acessorio");
		janelaCliente.setLayout(null);
		janelaCliente.add(tituloMenuCliente);
		janelaCliente.add(cadastrarCliente);
		janelaCliente.add(mostrarContaCliente);
		janelaCliente.add(comprarProduto);
		janelaCliente.add(voltar);
		janelaCliente.add(buscarBtn);
		janelaCliente.setSize(500, 460);
		janelaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCliente.setVisible(true);
		janelaCliente.setResizable(false);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarCliente) {
			new CadastraCliente();
			janelaCliente.setVisible(false);
		}
		
		if(src == mostrarContaCliente) {
			new MenuContaCliente();
			janelaCliente.setVisible(false);
		}
		
		if(src == comprarProduto) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (src == buscarBtn) {
			new BuscaRoupaEAcessorio();
			janelaCliente.setVisible(false);
;		}
		
		if(src == voltar) {
			new ViewMenu();
			janelaCliente.setVisible(false);
		}
		
	}

}
