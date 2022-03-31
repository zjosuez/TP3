package view;

import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerRoupaEAcessorio;
import model.Dados;

public class CadastraRoupaEAcessorio extends JFrame implements ActionListener{
	
	private final ControllerRoupaEAcessorio controller;
	private final JFrame janelaViewRoupaEAcessorio;
	private final JLabel tituloViewRoupaEAcessorio;
	private final JLabel nomeProduto;
	private final JLabel categoriaProduto;
	private final JLabel modeloProduto;
	private final JLabel tamanhoProduto;
	private final JLabel condicaoDeUso;
	private final JLabel precoProduto;
	private final JLabel generoProduto;
	private final JLabel descricaoProduto;
	private final JTextField nomeTexto;
	private final JTextField categoriaTexto;
	private final JTextField modeloTexto;
	private final JTextField tamanhoTexto;
	private final JTextField condicaoDeUsoTexto;
	private final JTextField precoTexto;
	private final JTextField generoTexto;
	private final JTextField descricaoTexto;
	private final JButton cadastrarbtn;
	private final JButton cancelarbtn;
	
	public CadastraRoupaEAcessorio() {
		
		controller = new ControllerRoupaEAcessorio(this);
		
		// Criando o JFrame
		janelaViewRoupaEAcessorio = new JFrame("menu");
		
		// titulo da janela
		tituloViewRoupaEAcessorio = new JLabel("Cadastro roupa e acessorio");
		tituloViewRoupaEAcessorio.setFont(new Font("Arial", Font.BOLD, 18));
		tituloViewRoupaEAcessorio.setBounds(168,19,245,30);
		janelaViewRoupaEAcessorio.add(tituloViewRoupaEAcessorio);
		
		// Label do nome
		nomeProduto = new JLabel("Nome");
		nomeProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		nomeProduto.setBounds(20, 70, 154, 14);
		janelaViewRoupaEAcessorio.add(nomeProduto);
		
		// Label da categoria
		categoriaProduto = new JLabel("Categoria");
		categoriaProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		categoriaProduto.setBounds(20, 120, 154, 15);
		janelaViewRoupaEAcessorio.add(categoriaProduto);
		
		// Label do modelo
		modeloProduto = new JLabel("Modelo");
		modeloProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		modeloProduto.setBounds(20, 170, 154, 14);
		janelaViewRoupaEAcessorio.add(modeloProduto);
		
		// Label do tamanho
		tamanhoProduto = new JLabel("Tamanho");
		tamanhoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		tamanhoProduto.setBounds(20, 220, 154, 14);
		janelaViewRoupaEAcessorio.add(tamanhoProduto);
		
		// Label da condicao de uso
		condicaoDeUso = new JLabel("Condicao de uso");
		condicaoDeUso.setFont(new Font("Arial", Font.PLAIN, 15));
		condicaoDeUso.setBounds(20, 270, 154, 14);
		janelaViewRoupaEAcessorio.add(condicaoDeUso);
		
		// Label do preco
		precoProduto = new JLabel("Preco");
		precoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		precoProduto.setBounds(20, 320, 154, 14);
		janelaViewRoupaEAcessorio.add(precoProduto);
		
		// Label do genero
		generoProduto = new JLabel("Genero");
		generoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		generoProduto.setBounds(20, 370, 154, 14);
		janelaViewRoupaEAcessorio.add(generoProduto);
		
		// Label da descricao
		descricaoProduto = new JLabel("Descricao do produto");
		descricaoProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		descricaoProduto.setBounds(20, 420, 154, 14);
		janelaViewRoupaEAcessorio.add(descricaoProduto);
		
		// Criacao da JText nome
		nomeTexto = new JTextField();
		nomeTexto.setColumns(10);
		nomeTexto.setBounds(20, 95, 250, 22);
		janelaViewRoupaEAcessorio.add(nomeTexto);
		
		// Criando JText categoria
		categoriaTexto = new JTextField();
		categoriaTexto.setColumns(10);
		categoriaTexto.setBounds(20, 145, 250, 22);
		janelaViewRoupaEAcessorio.add(categoriaTexto);
		
		// Criando JText modelo
		modeloTexto = new JTextField();
		modeloTexto.setColumns(10);
		modeloTexto.setBounds(20, 195, 250, 22);
		janelaViewRoupaEAcessorio.add(modeloTexto);
		
		// Criando JText tamanho
		tamanhoTexto = new JTextField();
		tamanhoTexto.setColumns(10);
		tamanhoTexto.setBounds(20, 245, 250, 22);
		janelaViewRoupaEAcessorio.add(tamanhoTexto);
		
		// Criando JText condicao de uso
		condicaoDeUsoTexto = new JTextField();
		condicaoDeUsoTexto.setColumns(10);
		condicaoDeUsoTexto.setBounds(20, 295, 250, 22);
		janelaViewRoupaEAcessorio.add(condicaoDeUsoTexto);
		
		// Criando JText preco
		precoTexto = new JTextField();
		precoTexto.setColumns(10);
		precoTexto.setBounds(20, 345, 250, 22);
		janelaViewRoupaEAcessorio.add(precoTexto);
		
		// Criando JText genero
		generoTexto = new JTextField();
		generoTexto.setColumns(10);
		generoTexto.setBounds(20, 395, 250, 22);
		janelaViewRoupaEAcessorio.add(generoTexto);
		
		// Criando JText descricao
		descricaoTexto = new JTextField();
		descricaoTexto.setColumns(10);
		descricaoTexto.setBounds(20, 445, 250, 22);
		janelaViewRoupaEAcessorio.add(descricaoTexto);
		
		// Criando os JButtons
		
		// Criando JButton cadastrar
		cadastrarbtn = new JButton("Cadastrar");
		cadastrarbtn.setBounds(325,215,180,60);
		cadastrarbtn.addActionListener(this);
		janelaViewRoupaEAcessorio.add(cadastrarbtn);
		
		// Criando JButton cancelar
		cancelarbtn = new JButton("Cancelar");
		cancelarbtn.setBounds(325, 300, 180, 60);
		cancelarbtn.addActionListener(this);
		janelaViewRoupaEAcessorio.add(cancelarbtn);
		
		// criacao do jframe
		janelaViewRoupaEAcessorio.setLayout(null);
		janelaViewRoupaEAcessorio.setSize(575, 540);
		janelaViewRoupaEAcessorio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaViewRoupaEAcessorio.setVisible(true);
		janelaViewRoupaEAcessorio.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrarbtn) {
			controller.cadastrarRoupaEAcessorio();
			JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			System.out.println(Dados.getProducts());
			new MenuRoupaEAcessorio();
			janelaViewRoupaEAcessorio.setVisible(false);
		}
		
		if(src == cancelarbtn) {
			JOptionPane.showMessageDialog(null, "O cadastro foi cancelado!", null, JOptionPane.INFORMATION_MESSAGE);
			new MenuRoupaEAcessorio();
			janelaViewRoupaEAcessorio.setVisible(false);
		}
	}
		
	public JTextField getNomeTexto() {
		return nomeTexto;
	}
	public JTextField getCategoriaTexto() {
		return categoriaTexto;
	}
	public JTextField getModeloTexto() {
		return modeloTexto;
	}
	public JTextField getTamanhoTexto() {
		return tamanhoTexto;
	}
	public JTextField getCondicaoDeUsoTexto() {
		return condicaoDeUsoTexto;
	}
	public JTextField getPrecoTexto() {
		return precoTexto;
	}
	public JTextField getGeneroTexto() {
		return generoTexto;
	}
	public JTextField getDescricaoTexto() {
		return descricaoTexto;
	}
	
}
