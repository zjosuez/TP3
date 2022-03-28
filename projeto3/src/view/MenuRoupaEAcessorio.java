package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuRoupaEAcessorio extends JFrame implements ActionListener{

	private final JFrame janelaProduto;
	private final JLabel titulo;
	private final JButton cadastrarProduto;
	private final JButton deletarProduto;
//	private final JButton buscarNome;
//	private final JButton buscarCategoria;
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
		deletarProduto.setBounds(145,120,200,30);
		deletarProduto.addActionListener(this);
		
		// Cria botao buscar nome
//		buscarNome = new JButton("Buscar pelo nome");
//		buscarNome.setBounds(145,170,200,30);
//		buscarNome.addActionListener(this);
		
		// Cria botao buscar categoria
//		buscarCategoria = new JButton("Buscar pela categoria");
//		buscarCategoria.setBounds(145,220,200,30);
//		buscarCategoria.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 270, 200, 30);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaProduto = new JFrame("Menu Roupa e acessorio");
		janelaProduto.setLayout(null);
		janelaProduto.add(titulo);
		janelaProduto.add(cadastrarProduto);
		janelaProduto.add(deletarProduto);
//		janelaProduto.add(buscarNome);
//		janelaProduto.add(buscarCategoria);
		janelaProduto.add(voltar);
		janelaProduto.setSize(500, 420);
		janelaProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaProduto.setVisible(true);
		janelaProduto.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarProduto) {
			new CadastrarRoupaEAcessorio();
			janelaProduto.setVisible(false);
		}
		
		if(src == deletarProduto) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
//		if(src == buscarNome) {
////			new BuscaRoupaEAcessorio();
////			janelaProduto.setVisible(false);
//		}
//		
//		if(src == buscarCategoria) {
//			JOptionPane.showMessageDialog(null, 
//					"Ainda precisam ser implementadas as funcionalidades\n"
//					+ "relacionadas a curso e a matricula", null, 
//					JOptionPane.INFORMATION_MESSAGE);
//		}
		if(src == voltar) {
			new ViewMenu();
			janelaProduto.setVisible(false);
		}
		
	}

}
