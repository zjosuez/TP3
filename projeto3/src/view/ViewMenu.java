package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Dados;

public class ViewMenu extends JFrame implements ActionListener{

	private final static JFrame janela = new JFrame("Tela Principal");
	private final static JLabel titulo = new JLabel("Menu Principal");
	private final static JButton produto = new JButton("Roupas e Acessorios");
	private final static JButton cliente = new JButton("Cliente");
	private final static JButton vendedor = new JButton("Vendedor");
	private final static JButton sair = new JButton("Sair");
	
	public static void main(String[] args) {
		ViewMenu menu = new ViewMenu();
		
		produto.addActionListener(menu);
		cliente.addActionListener(menu);
		vendedor.addActionListener(menu);
		sair.addActionListener(menu);
		Dados.cadastrarDados();
	}
	
	public ViewMenu() {
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(165,17,275,30);
		produto.setBounds(140,57,200,30);
		cliente.setBounds(140,107,200,30);
		vendedor.setBounds(140,157,200,30);
		sair.setBounds(140, 207, 200, 30);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(produto);
		janela.add(cliente);
		janela.add(vendedor);
		janela.add(sair);
		janela.setSize(500, 350);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setResizable(false);
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == produto) {
			new MenuRoupaEAcessorio();
			janela.setVisible(false);
		}
			
		
		if(src == cliente) {
			new MenuCliente();
			janela.setVisible(false);
		}
		
		if(src == vendedor) {
			new MenuVendedor();
			janela.setVisible(false);
		}
		
		if(src == sair) { 
				janela.setVisible(false);
		}
	}
 }
