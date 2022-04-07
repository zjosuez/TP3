package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controller.ControllerRoupaEAcessorio;
import model.RoupaEAcessorio;

/**
 * Classe responsavel por deletar uma RoupaEAcessorio
 * seleciona um produto e faz a remocao do mesmo.
 * 
 * @author Josue Teixeira Santana
 */
public class DeletarRoupaEAcessorio extends JFrame implements ActionListener {
	
	private final ControllerRoupaEAcessorio controller;
	private JTextArea produtoAreaTexto;
	private final JLabel tituloDeletarRoupaEAcessorio;
	private final JFrame janelaDeletarProduto;
	private final JComboBox<String> buscarProdutoComboBox;
	private final JButton okBtn;
	private final JButton voltarBnt;
	private final JButton deletarBtn;
	private RoupaEAcessorio product;
	
	/**
	 * Metodo que cria todas as Jlabels, JTextField... interface no geral.
	 * Esse metodo faz a selecao do produto atraves de um comboBox e depois
	 * de selecionado voce pode executar a acao no botao.
	 * 
	 * @see MenuRoupaEAcessorio
	 */
	public DeletarRoupaEAcessorio() {
		
		controller = new ControllerRoupaEAcessorio(this);
		
		// Criando o JFrame
		janelaDeletarProduto = new JFrame("Menu Deletar");
				
		// titulo da janela
		tituloDeletarRoupaEAcessorio = new JLabel("Deletar roupa e acessorio");
		tituloDeletarRoupaEAcessorio.setFont(new Font("Arial", Font.BOLD, 18));
		tituloDeletarRoupaEAcessorio.setBounds(168,19,245,30);
		janelaDeletarProduto.add(tituloDeletarRoupaEAcessorio);		
		
		// Area texto do produto
		produtoAreaTexto = new JTextArea();
		produtoAreaTexto.setBounds(25, 150, 510, 199);
		produtoAreaTexto.setEditable(false);
		janelaDeletarProduto.add(produtoAreaTexto);
		
		// criacao do jframe
		janelaDeletarProduto.setLayout(null);
		janelaDeletarProduto.setSize(575, 540);
		janelaDeletarProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaDeletarProduto.setVisible(true);
		janelaDeletarProduto.setResizable(false);
			
		// ok button
		okBtn = new JButton("Mostrar Detalhes");
		okBtn.setBounds(25, 370, 150, 35);
		okBtn.addActionListener(this);
		janelaDeletarProduto.add(okBtn);
		
		// voltar button
		voltarBnt = new JButton("Voltar");
		voltarBnt.setBounds(386, 370, 150, 35);
		voltarBnt.addActionListener(this);
		janelaDeletarProduto.add(voltarBnt);
		
		// Deletar btn
		deletarBtn = new JButton("Deletar");
		deletarBtn.setBounds(208, 370, 150, 35);
		deletarBtn.addActionListener(this);
		janelaDeletarProduto.add(deletarBtn);
			
		// comboBox
		buscarProdutoComboBox = new JComboBox<>();
		buscarProdutoComboBox.setBounds(64, 80, 390, 22);
		buscarProdutoComboBox.setModel(controller.atualizarProduto());
		janelaDeletarProduto.add(buscarProdutoComboBox);
		buscarProdutoComboBox.addItem("Selecionar Produto");
		buscarProdutoComboBox.setSelectedIndex(0);
	}
	
	public JComboBox<String> getBuscarProdutoComboBox() {
		return buscarProdutoComboBox;
	}

	public JButton getOkBtn() {
		return okBtn;
	}

	/**
	 * Executa o comando quando o botão é clicado.
	 * (1) Mostrar detalhes - mostra todos os dados do produto
	 * (2) Deletar - deleta o produto dos dados cadastrados
	 * (3) Voltar - volta para  a view anterior
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		Object botao = e.getSource();
		if (botao == okBtn) {
            produtoAreaTexto.setText(((controller.buscarRoupaEAcessorio((String)getBuscarProdutoComboBox().getSelectedItem())).toString())); 
            produtoAreaTexto.updateUI();
		}
		if(botao == deletarBtn) {
			controller.removerRoupaEAcessorio((String)getBuscarProdutoComboBox().getSelectedItem());
			new MenuRoupaEAcessorio();
			janelaDeletarProduto.setVisible(false);
		}
			
        
		if (botao == voltarBnt) {
			new MenuRoupaEAcessorio();
			janelaDeletarProduto.setVisible(false);
		}
		
	}
}
