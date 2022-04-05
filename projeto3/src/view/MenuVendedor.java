package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuVendedor extends JFrame implements ActionListener {

	private final JFrame janelaVendedor;
	private final JLabel tituloVendedor;
	private final JButton cadastrarVendedor;
	private final JButton minhaConta;
	private final JButton vendas;
	private final JButton voltar;
	
	public MenuVendedor() {
		tituloVendedor = new JLabel("Menu Vendedor");
		tituloVendedor.setFont(new Font("Arial", Font.BOLD, 20));
		tituloVendedor.setBounds(159,17,245,30);
		
		// Cria botao cadastrar
		cadastrarVendedor = new JButton("Cadastrar Vendedor");
		cadastrarVendedor.setBounds(135,70,200,30);
		cadastrarVendedor.addActionListener(this);
		
		// Cria botao deletar
		minhaConta= new JButton("Minha conta");
		minhaConta.setBounds(135,120,200,30);
		minhaConta.addActionListener(this);
		
		// Cria botao buscar nome
		vendas = new JButton("Vendas");
		vendas.setBounds(135,170,200,30);
		vendas.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(135, 220, 200, 30);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaVendedor = new JFrame("Menu Roupa e acessorio");
		janelaVendedor.setLayout(null);
		janelaVendedor.add(tituloVendedor);
		janelaVendedor.add(cadastrarVendedor);
		janelaVendedor.add(minhaConta);
		janelaVendedor.add(vendas);
		janelaVendedor.add(voltar);
		janelaVendedor.setSize(475, 390);
		janelaVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaVendedor.setVisible(true);
		janelaVendedor.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarVendedor) {
			
			new CadastraVendedor();
			janelaVendedor.setVisible(false);
		}
		
		if(src == minhaConta) {
			
			new MenuContaVendedor();
			janelaVendedor.setVisible(false);
		}
		
		if(src == vendas) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matricula", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}

		if(src == voltar) {
			new ViewMenu();
			janelaVendedor.setVisible(false);
		}
		
	}

}
