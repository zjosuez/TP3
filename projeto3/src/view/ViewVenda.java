package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import controller.ControllerVenda;


/**
 * Classe principal responsavel pela tela inicial e pelo main
 * 
 * @author Josue Teixeira Santana
 */
public class ViewVenda extends JFrame implements ActionListener{
	
	private final Double produto;
	private final JFrame janelaViewVenda;
	private final JLabel tituloViewVenda;
	private final JLabel formaDePagamento;
	private final JLabel qtdProduto;
	private final JLabel precoProduto;
	private final JLabel totalProduto;
	private final JTextArea totalProdutoTexto;
	private final JTextField formaDePagamentoTexto;
	private final JComboBox qtdProdutoTexto;
	private final JTextArea precoProdutoTexto;
	private final JButton calcularBtn;
	private final JButton comprarBtn;
	private final JButton voltarBnt;
	private final ControllerVenda controller;
	
	/**
	 * Metodo que cria toda a interface de interacao com o usuario.
	 * Recebe como parametro o valor do produto para calcular o preco total
	 * @param valor 
	 */
	public ViewVenda(Double valor) {
		
		controller = new ControllerVenda(this);
		this.produto = valor;
		
		Integer [] numbers = {1,2,3,4};
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
		formaDePagamento.setBounds(20, 70, 154, 15);
		janelaViewVenda.add(formaDePagamento);

		qtdProduto = new JLabel("Quantidade");
		qtdProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		qtdProduto.setBounds(20, 130, 154, 15);
		janelaViewVenda.add(qtdProduto);
		
		precoProduto = new JLabel("Preco do produto");
		precoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		precoProduto.setBounds(20, 190, 154, 15);
		janelaViewVenda.add(precoProduto);
		
		formaDePagamentoTexto = new JTextField();
		formaDePagamentoTexto.setColumns(10);
		formaDePagamentoTexto.setBounds(20, 90, 250, 22);
		janelaViewVenda.add(formaDePagamentoTexto);
		
		qtdProdutoTexto = new JComboBox(numbers);
		qtdProdutoTexto.setBounds(20, 150, 100, 22);
		janelaViewVenda.add(qtdProdutoTexto);
		
		totalProduto = new JLabel("Preco total do produto");
		totalProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		totalProduto.setBounds(20, 250, 154, 15);
		janelaViewVenda.add(totalProduto);

		totalProdutoTexto = new JTextArea();
		totalProdutoTexto.setBounds(20, 270, 250, 22);
		totalProdutoTexto.setEditable(false);
		janelaViewVenda.add(totalProdutoTexto);
		totalProdutoTexto.setText(valor.toString());
		
		precoProdutoTexto = new JTextArea();
		precoProdutoTexto.setBounds(20, 210, 250, 22);
		precoProdutoTexto.setEditable(false);
		janelaViewVenda.add(precoProdutoTexto);
		precoProdutoTexto.setText(valor.toString());
		
		// comprar button
		comprarBtn = new JButton("Confirmar Compra");
		comprarBtn.setBounds(25, 370, 150, 35);
		comprarBtn.addActionListener(this);
		janelaViewVenda.add(comprarBtn);
		
		// comprar button
		calcularBtn = new JButton("Calcular");
		calcularBtn.setBounds(200, 150, 100, 25);
		calcularBtn.addActionListener(this);
		janelaViewVenda.add(calcularBtn);
		
		// voltar button
		voltarBnt = new JButton("Voltar");
		voltarBnt.setBounds(250, 370, 150, 35);
		voltarBnt.addActionListener(this);
		janelaViewVenda.add(voltarBnt);
	}

	public JComboBox getQtdProdutoTexto() {
		return qtdProdutoTexto;
	}

	public JTextArea getTotalProdutoTexto() {
		return totalProdutoTexto;
	}

	public JTextField getFormaDePagamentoTexto() {
		return formaDePagamentoTexto;
	}

	public JTextArea getPrecoProdutoTexto() {
		return precoProdutoTexto;
	}

	public Double getProduto() {
		return produto;
	}

	/**
	 * Executa a acao quando um botao e pressionado.
	 * (1) calcular - faz o calculo do preco total do produto
	 * (2) comprar- faz a compra do produto pelo cliente
	 * (3) voltar - volta para a view anterior
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == calcularBtn) {
			totalProdutoTexto.setText(controller.calculoTotal(this.produto).toString());
		}
		
		if(src == voltarBnt) {
			new ViewCompra();
			janelaViewVenda.setVisible(false);
		}
		
		if(src == comprarBtn) {
			controller.cadastrarVenda();
			JOptionPane.showMessageDialog(null, "Compra realizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			new MenuCliente();
			janelaViewVenda.setVisible(false);
		}
	}
}
