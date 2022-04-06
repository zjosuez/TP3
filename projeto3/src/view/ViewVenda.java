package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.ControllerVenda;
import model.Cliente;
//import controller.ControllerVenda;
import model.RoupaEAcessorio;

public class ViewVenda extends JFrame implements ActionListener{
	
	private final Double produto;
	private final JFrame janelaViewVenda;
	private final JLabel tituloViewVenda;
	private final JLabel formaDePagamento;
	private final JLabel qtdProduto;
	private final JLabel precoProduto;
	private final JTextField formaDePagamentoTexto;
	private final JTextField qtdProdutoTexto;
	private final JTextArea precoProdutoTexto;
	private final JButton comprarBtn;
	private final JButton voltarBnt;
	private final ControllerVenda controller;
	
	public ViewVenda(Double double1) {
		
		controller = new ControllerVenda(this);
		this.produto = double1;
		
		janelaViewVenda = new JFrame("Menu Venda");
		janelaViewVenda.setLayout(null);
		janelaViewVenda.setSize(480, 510);
		janelaViewVenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaViewVenda.setVisible(true);
		janelaViewVenda.setResizable(false);
		
		tituloViewVenda = new JLabel("Venda");
		tituloViewVenda.setFont(new Font("Arial", Font.BOLD, 18));
		tituloViewVenda.setBounds(212,19,245,30);
		janelaViewVenda.add(tituloViewVenda);
		
		formaDePagamento = new JLabel("Forma de Pagamento");
		formaDePagamento.setFont(new Font("Arial", Font.PLAIN, 15));
		formaDePagamento.setBounds(20, 90, 154, 15);
		janelaViewVenda.add(formaDePagamento);

		qtdProduto = new JLabel("Quantidade");
		qtdProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		qtdProduto.setBounds(20, 180, 154, 15);
		janelaViewVenda.add(qtdProduto);
		
		precoProduto = new JLabel("Preco do produto");
		precoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		precoProduto.setBounds(20, 270, 154, 15);
		janelaViewVenda.add(precoProduto);
		
		formaDePagamentoTexto = new JTextField();
		formaDePagamentoTexto.setColumns(10);
		formaDePagamentoTexto.setBounds(20, 110, 250, 22);
		janelaViewVenda.add(formaDePagamentoTexto);
		
		qtdProdutoTexto = new JTextField();
		qtdProdutoTexto.setColumns(10);
		qtdProdutoTexto.setBounds(20, 200, 250, 22);
		janelaViewVenda.add(qtdProdutoTexto);
		
		precoProdutoTexto = new JTextArea();
		precoProdutoTexto.setBounds(20, 290, 250, 22);
		precoProdutoTexto.setEditable(false);
		janelaViewVenda.add(precoProdutoTexto);
		precoProdutoTexto.setText(double1.toString());
		
		// comprar button
		comprarBtn = new JButton("Confirmar Compra");
		comprarBtn.setBounds(25, 370, 150, 35);
		comprarBtn.addActionListener(this);
		janelaViewVenda.add(comprarBtn);
		
		// voltar button
		voltarBnt = new JButton("Voltar");
		voltarBnt.setBounds(250, 370, 150, 35);
		voltarBnt.addActionListener(this);
		janelaViewVenda.add(voltarBnt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
