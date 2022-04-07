package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.ControllerContaVendedor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControllerRoupaEAcessorio;

/**
 * Classe responsavel pela view de busca, tanto pelo produto
 * quanto pelo vendedor para verificar se eles existem nos dados
 * cadastrados
 * 
 * @author Josue Teixeira Santana
 */
public class ViewBusca extends JFrame implements ActionListener{
	
	private final ControllerContaVendedor controller1;
	private final ControllerRoupaEAcessorio controller2;
	private final JFrame janelaBusca;
	private final JLabel tituloBusca;
	private final JLabel produtoBusca;
	private final JLabel vendedorBusca;
	private JTextField produtoBuscaTexto;
	private JTextField vendedorBuscaTexto;
	private final JButton buscarVendedorBtn;
	private final JButton buscarProdutoBtn;
	private final JButton voltarBtn;
	
	/**
	 * Metodo que cria todas as Jlabels, JTextField... etc
	 * cria ainda 3 botoes 
	 * (1) Buscar vendedor - responsavel por chamar o metodo de busca para 
	 * verificar a existencia do vendendor
	 * (2) Buscar produto - responsavel por chamar o metodo de busca para 
	 * verificar a existencia do produto
	 * (3) Voltar - volta para a view anterior
	 * 
	 * @see MenuRoupaEAcessorio
	 */
	public ViewBusca() {
		
		controller1 = new ControllerContaVendedor(this);
		controller2 = new ControllerRoupaEAcessorio(this);
		
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
		buscarProdutoBtn = new JButton("Buscar Produto");
		buscarProdutoBtn.setBounds(325,115,150,35);
		buscarProdutoBtn.addActionListener(this);
		janelaBusca.add(buscarProdutoBtn);
		
		// Criando JButton cadastrar
		buscarVendedorBtn = new JButton("Buscar Vendedor");
		buscarVendedorBtn.setBounds(325,205,150,35);
		buscarVendedorBtn.addActionListener(this);
		janelaBusca.add(buscarVendedorBtn);
				
		// Criando JButton cancelar
		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(325, 285, 150, 35);
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

	public JButton getBuscarVendedorBtn() {
		return buscarVendedorBtn;
	}

	public ControllerContaVendedor getController1() {
		return controller1;
	}

	public ControllerRoupaEAcessorio getController2() {
		return controller2;
	}

	/**
	 * Executa o comando quando um botao e pressionado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if (src == buscarVendedorBtn) {
			
			boolean resultado1 = false;
			String valor1 = getVendedorBuscaTexto().getText();
			resultado1 = controller1.verificarIgualdade(valor1);
			
			
			if (resultado1 == true) {
				JOptionPane.showMessageDialog(null, "O vendedor foi encontrado!", null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "O vendedor não foi encontrado", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if (src == buscarProdutoBtn) {
			boolean resultado2 = false;
			String valor2 = getProdutoBuscaTexto().getText();
			resultado2 = controller2.verificarIgualdade(valor2);
			
			
			if (resultado2 == true) {
				JOptionPane.showMessageDialog(null, "O produto foi encontrado!", null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "O produto não foi encontrado", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if (src == voltarBtn) {
			new MenuCliente();
			janelaBusca.setVisible(false);
		}
		
	}
}
