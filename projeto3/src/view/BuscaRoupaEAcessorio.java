package view;

import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.ControllerContaVendedor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControllerRoupaEAcessorio;


public class BuscaRoupaEAcessorio extends JFrame implements ActionListener{
	private final ControllerContaVendedor controller;
	


	private final JFrame janelaBusca;
	private final JLabel tituloBusca;
	private final JLabel produtoBusca;
	private final JLabel vendedorBusca;
	private JTextField produtoBuscaTexto;
	private JTextField vendedorBuscaTexto;
	private final JButton buscarBtn;
	private final JButton voltarBtn;
	
	public BuscaRoupaEAcessorio() {
		controller = new ControllerContaVendedor(this);
		// Criacao da JFrame
		janelaBusca = new JFrame("Menu Busca");
		janelaBusca.setLayout(null);
		janelaBusca.setSize(550, 380);
		janelaBusca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaBusca.setVisible(true);
		janelaBusca.setResizable(false);
		
		// Cria o titulo do frame
		tituloBusca = new JLabel("Menu roupa e acessorio");
		tituloBusca.setFont(new Font("Arial", Font.BOLD, 20));
		tituloBusca.setBounds(145,18,250,30);
		janelaBusca.add(tituloBusca);
		
		// Cria uma Jlabel para busca pelo produto
		produtoBusca = new JLabel("Buscar pelo produto");
		produtoBusca.setFont(new Font("Arial", Font.PLAIN, 15));
		produtoBusca.setBounds(20, 100, 154, 30);
		janelaBusca.add(produtoBusca);
		
		// Cria uma Jlabel para busca pelo produto
		vendedorBusca = new JLabel("Buscar pelo vendedor");
		vendedorBusca.setFont(new Font("Arial", Font.PLAIN, 15));
		vendedorBusca.setBounds(20, 190, 154, 30);
		janelaBusca.add(vendedorBusca);
		
		// Criando JText Endereco
		produtoBuscaTexto = new JTextField();
		produtoBuscaTexto.setColumns(10);
		produtoBuscaTexto.setBounds(20, 130, 250, 22);
		janelaBusca.add(produtoBuscaTexto);
		
		// Criando JText telefone
		vendedorBuscaTexto = new JTextField();
		vendedorBuscaTexto.setColumns(10);
		vendedorBuscaTexto.setBounds(20, 220, 250, 22);
		janelaBusca.add(vendedorBuscaTexto);
		
		// Criando JButton cadastrar
		buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(325,110,180,50);
		buscarBtn.addActionListener(this);
		janelaBusca.add(buscarBtn);
				
		// Criando JButton cancelar
		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(325, 200, 180, 50);
		voltarBtn.addActionListener(this);
		janelaBusca.add(voltarBtn);
		
	}

	public JTextField getProdutoBuscaTexto() {
		return produtoBuscaTexto;
	}

	public JTextField getVendedorBuscaTexto() {
		return vendedorBuscaTexto;
	}

	public void setProdutoBuscaTexto(JTextField produtoBuscaTexto) {
		this.produtoBuscaTexto = produtoBuscaTexto;
	}

	public void setVendedorBuscaTexto(JTextField vendedorBuscaTexto) {
		this.vendedorBuscaTexto = vendedorBuscaTexto;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if (src == buscarBtn) {
			String valor = getVendedorBuscaTexto().getText();
			boolean resultado = controller.verificarIgualdade(valor);
			
			if (resultado == true) {
				JOptionPane.showMessageDialog(null, "O vendedor foi encontrado!", null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "O vendedor não foi encontrado", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if (src == voltarBtn) {
			new MenuCliente();
			janelaBusca.setVisible(false);
		}
		
	}
}
