package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.ControllerRoupaEAcessorio;
import controller.ControllerVenda;

public class ViewCompra extends JFrame implements ActionListener{
	
	private final ControllerVenda controller;
	private JTextArea vendaAreaTexto;
	private final JLabel tituloVenda;
	private final JFrame janelaVenda;
	private final JComboBox<String> produtoComboBox;
	private final JButton comprarBtn;
	private final JButton voltarBnt;
	private final JButton verProduto;
	private ControllerRoupaEAcessorio controller2;
	
	public ViewCompra() {
		
		controller = new ControllerVenda(this);
		controller2 = new ControllerRoupaEAcessorio(this);
		janelaVenda = new JFrame("Menu Venda");
		janelaVenda.setLayout(null);
		janelaVenda.setSize(575, 540);
		janelaVenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaVenda.setVisible(true);
		janelaVenda.setResizable(false);
		
		// titulo da janela
		tituloVenda = new JLabel("Comprar Produto");
		tituloVenda.setFont(new Font("Arial", Font.BOLD, 18));
		tituloVenda.setBounds(230,19,245,30);
		janelaVenda.add(tituloVenda);	
		
		// Area texto do produto
		vendaAreaTexto = new JTextArea();
		vendaAreaTexto.setBounds(25, 150, 510, 199);
		vendaAreaTexto.setEditable(false);
		janelaVenda.add(vendaAreaTexto);
		
		// comboBox
		produtoComboBox = new JComboBox<>();
		produtoComboBox.setBounds(64, 80, 390, 22);
		produtoComboBox.setModel(controller.atualizarProduto());
		janelaVenda.add(produtoComboBox);
		produtoComboBox.addItem("Selecionar Filme");
		produtoComboBox.setSelectedIndex(0); 

		// comprar button
		verProduto = new JButton("Mostrar");
		verProduto.setBounds(460, 80, 80, 22);
		verProduto.addActionListener(this);
		janelaVenda.add(verProduto);
		
		// comprar button
		comprarBtn = new JButton("Comprar");
		comprarBtn.setBounds(25, 370, 150, 35);
		comprarBtn.addActionListener(this);
		janelaVenda.add(comprarBtn);
		
		// voltar button
		voltarBnt = new JButton("Voltar");
		voltarBnt.setBounds(386, 370, 150, 35);
		voltarBnt.addActionListener(this);
		janelaVenda.add(voltarBnt);
	}

	public JTextArea getVendaAreaTexto() {
		return vendaAreaTexto;
	}

	public JFrame getJanelaVenda() {
		return janelaVenda;
	}

	public JButton getComprarBtn() {
		return comprarBtn;
	}

	public JButton getVoltarBnt() {
		return voltarBnt;
	}

	public JButton getVerProduto() {
		return verProduto;
	}

	public JComboBox<String> getProdutoComboBox() {
		return produtoComboBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == verProduto) {
			getVendaAreaTexto().setText(((controller2.buscarRoupaEAcessorio((String)getProdutoComboBox().getSelectedItem()))).toString());
		}
		
		this.controller.executaBotao(e.getSource());
		
	}
}	
