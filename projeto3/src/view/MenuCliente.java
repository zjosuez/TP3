package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe responsavel pela selecao da acao do cliente
 * 
 * @author Josue Teixeira Santana
 */
public class MenuCliente extends JFrame implements ActionListener {

	private final JFrame janelaCliente;
	private final JLabel tituloMenuCliente;
	private final JButton cadastrarCliente;
	private final JButton mostrarContaCliente;
	private final JButton comprarProduto;
	private final JButton voltar;
	private final JButton buscarBtn;
	
	/**
	 * Metodo que cria toda a interface de interacao com o usuario.
	 * Leva o usuario ate a view da acao que ele deseja realizar
	 * 
	 * @see CadastraCliente
	 * @see MenuContaCliente
	 * @see ViewCompra
	 * @see ViewBusca
	 */
	public MenuCliente() {
		tituloMenuCliente = new JLabel("Menu Cliente");
		tituloMenuCliente.setFont(new Font("Arial", Font.BOLD, 20));
		tituloMenuCliente.setBounds(179,17,245,30);
		
		// Cria botao cadastrar
		cadastrarCliente = new JButton("Cadastrar Cliente");
		cadastrarCliente.setBounds(145,80,200,40);
		cadastrarCliente.addActionListener(this);
		
		// Cria botao deletar
		mostrarContaCliente = new JButton("Mostrar Conta");
		mostrarContaCliente.setBounds(145,140,200,40);
		mostrarContaCliente.addActionListener(this);
		
		// Cria botao para comprar produto
		comprarProduto = new JButton("Comprar Produto");
		comprarProduto.setBounds(145,200,200,40);
		comprarProduto.addActionListener(this);
		
		// Cria botao voltar
		buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(145, 260, 200, 40);
		buscarBtn.addActionListener(this);
		
		// Cria botao voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 320, 200, 40);
		voltar.addActionListener(this);
		
		// Cadastra o JFrame
		janelaCliente = new JFrame("Menu Roupa e acessorio");
		janelaCliente.setLayout(null);
		janelaCliente.add(tituloMenuCliente);
		janelaCliente.add(cadastrarCliente);
		janelaCliente.add(mostrarContaCliente);
		janelaCliente.add(comprarProduto);
		janelaCliente.add(voltar);
		janelaCliente.add(buscarBtn);
		janelaCliente.setSize(500, 460);
		janelaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCliente.setVisible(true);
		janelaCliente.setResizable(false);
	}
	
	/**
	 * Executa a acao quando um botao e pressionado.
	 * (1) Cadastrar cliente - chama view CadastraCliente
	 * (2) Mostrar Conta - chama a view MenuContaCliente
	 * (3) Comprar produto - chama a view ViewCompra
	 * (4) Buscar - chama a view BuscarRoupaEAcessorio
	 * (5) Voltar - volta para a view anterior
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarCliente) {
			new CadastraCliente();
			janelaCliente.setVisible(false);
		}
		
		if(src == mostrarContaCliente) {
			new MenuContaCliente();
			janelaCliente.setVisible(false);
		}
		
		if(src == comprarProduto) {
			new ViewCompra();
			janelaCliente.setVisible(false);
		}
		if (src == buscarBtn) {
			new ViewBusca();
			janelaCliente.setVisible(false);
;		}
		
		if(src == voltar) {
			new ViewMenu();
			janelaCliente.setVisible(false);
		}
		
	}

}
