package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.ControllerRoupaEAcessorio;

public class MenuRoupaEAcessorio extends JFrame implements ActionListener{

//	private final ControllerRoupaEAcessorio view;
	private final JFrame janelaProduto;
	private final JLabel titulo;
	private final JButton cadastrarProduto;
	private final JButton deletarProduto;
	private final JButton voltar;
	
	public MenuRoupaEAcessorio() {
		
		titulo = new JLabel("Menu roupa e acessorio");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(130,17,245,30);
		
		// Cria botao cadastrar
		cadastrarProduto = new JButton("Cadastrar");
		cadastrarProduto.setBounds(145,70,200,30);
		cadastrarProduto.addActionListener(this);
		
		// Cria botao deletar
		deletarProduto = new JButton("Deletar");
		deletarProduto.setBounds(145,140,200,30);
		deletarProduto.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 210, 200, 30);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaProduto = new JFrame("Menu Roupa e acessorio");
		janelaProduto.setLayout(null);
		janelaProduto.add(titulo);
		janelaProduto.add(cadastrarProduto);
		janelaProduto.add(deletarProduto);
		janelaProduto.add(voltar);
		janelaProduto.setSize(500, 380);
		janelaProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaProduto.setVisible(true);
		janelaProduto.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarProduto) {
			new CadastraRoupaEAcessorio();
			janelaProduto.setVisible(false);
		}
		
		if(src == deletarProduto) {
			new DeletarRoupaEAcessorio();
			janelaProduto.setVisible(false);
//			removerRoupaEAcessorio((String)view.buscarRoupaEAcessorio().getSelectedItem());
//	            new MenuCliente();
//	            view.getJanelaViewConta().setVisible(false);
		}

		if(src == voltar) {
			new ViewMenu();
			janelaProduto.setVisible(false);
		}
		
	}

}
