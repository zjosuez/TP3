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
	private final JButton deletarCliente;
	private final JButton editarCliente;
	private final JButton buscarNomeCliente;
	private final JButton comprarProduto;
	private final JButton voltar;
	
	public MenuCliente() {
		tituloMenuCliente = new JLabel("Menu Cliente");
		tituloMenuCliente.setFont(new Font("Arial", Font.BOLD, 20));
		tituloMenuCliente.setBounds(179,17,245,30);
		
		// Cria botao cadastrar
		cadastrarCliente = new JButton("Cadastrar Cliente");
		cadastrarCliente.setBounds(145,70,200,30);
		cadastrarCliente.addActionListener(this);
		
		// Cria botao deletar
		deletarCliente = new JButton("Deletar Cliente");
		deletarCliente.setBounds(145,120,200,30);
		deletarCliente.addActionListener(this);
		
		// Cria botao editar cliente
		editarCliente = new JButton("Editar Cliente");
		editarCliente.setBounds(145,170,200,30);
		editarCliente.addActionListener(this);
		
		// Cria botao busca cliente
		buscarNomeCliente = new JButton("Buscar Pelo Nome");
		buscarNomeCliente.setBounds(145,170,200,30);
		buscarNomeCliente.addActionListener(this);
		
		// Cria botao para comprar produto
		comprarProduto = new JButton("Comprar Produto");
		comprarProduto.setBounds(145,220,200,30);
		comprarProduto.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 270, 200, 30);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaCliente = new JFrame("Menu Roupa e acessorio");
		janelaCliente.setLayout(null);
		janelaCliente.add(tituloMenuCliente);
		janelaCliente.add(cadastrarCliente);
		janelaCliente.add(deletarCliente);
		janelaCliente.add(editarCliente);
		janelaCliente.add(buscarNomeCliente);
		janelaCliente.add(comprarProduto);
		janelaCliente.add(voltar);
		janelaCliente.setSize(500, 420);
		janelaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCliente.setVisible(true);
		janelaCliente.setResizable(false);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
Object src = e.getSource();
		
		if(src == cadastrarCliente) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(src == deletarCliente) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(src == editarCliente) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(src == buscarNomeCliente) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(src == comprarProduto) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(src == voltar) {
			new ViewMenu();
			janelaCliente.setVisible(false);
		}
		
	}

}
