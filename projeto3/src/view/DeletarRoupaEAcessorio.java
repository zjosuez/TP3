package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controller.ControllerRoupaEAcessorio;
import model.Dados;
import model.RoupaEAcessorio;

public class DeletarRoupaEAcessorio extends JFrame implements ActionListener {
	
	private final ControllerRoupaEAcessorio controller;
	private JTextArea produtoAreaTexto;
	private final JLabel tituloDeletarRoupaEAcessorio;
	private final JFrame janelaDeletarProduto;
	private final JComboBox<String> selecionarFilmeComboBox;
	private final JButton okBtn;
	private final JButton voltarBnt;
	private RoupaEAcessorio product;
	
	
	public DeletarRoupaEAcessorio() {
		
		controller = new ControllerRoupaEAcessorio(this);
		
		// Criando o JFrame
		janelaDeletarProduto = new JFrame("Menu Deletar");
				
		// titulo da janela
		tituloDeletarRoupaEAcessorio = new JLabel("Deletar roupa e acessorio");
		tituloDeletarRoupaEAcessorio.setFont(new Font("Arial", Font.BOLD, 18));
		tituloDeletarRoupaEAcessorio.setBounds(168,19,245,30);
		janelaDeletarProduto.add(tituloDeletarRoupaEAcessorio);		
		
//		// Area texto do produto
		produtoAreaTexto = new JTextArea();
		produtoAreaTexto.setBounds(20, 60, 510, 199);
		produtoAreaTexto.setEditable(false);
		janelaDeletarProduto.add(produtoAreaTexto);
		
		// criacao do jframe
		janelaDeletarProduto.setLayout(null);
		janelaDeletarProduto.setSize(575, 540);
		janelaDeletarProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaDeletarProduto.setVisible(true);
		janelaDeletarProduto.setResizable(false);
			
		// ok button
		okBtn = new JButton("OK");
		okBtn.setBounds(300, 260, 59, 28);
		okBtn.addActionListener(this);
		janelaDeletarProduto.add(okBtn);
		
		// voltar button
		voltarBnt = new JButton("Voltar");
		voltarBnt.setBounds(300, 300, 59, 28);
		voltarBnt.addActionListener(this);
		janelaDeletarProduto.add(voltarBnt);
			
		// comboBox
		selecionarFilmeComboBox = new JComboBox<>();
		selecionarFilmeComboBox.setBounds(64, 22, 390, 22);
		selecionarFilmeComboBox.setModel(controller.atualizarProduto());
		janelaDeletarProduto.add(selecionarFilmeComboBox);
		selecionarFilmeComboBox.addItem("Selecionar Filme");
		selecionarFilmeComboBox.setSelectedIndex(1);
	}
	
	public JComboBox<String> getSelecionarFilmeComboBox() {
		return selecionarFilmeComboBox;
	}

	public JButton getOkBtn() {
		return okBtn;
	}

	/**
	 * Executa o comando quando o botão é clicado
	 * 
	 * Implementa a interface ActionListener
	 */
	public void actionPerformed(ActionEvent e) {
		Object botao = e.getSource();
		if (botao == okBtn) {
            produtoAreaTexto.setText(((controller.buscarRoupaEAcessorio((String)getSelecionarFilmeComboBox().getSelectedItem())).toString())); 
            produtoAreaTexto.updateUI();
		}
			
        
		if (botao == voltarBnt) {
			new MenuRoupaEAcessorio();
			janelaDeletarProduto.setVisible(false);
		}
		
	}
}
