package controler;
import model.Dados;
import model.RoupaEAcessorio;
import view.CadastrarRoupaEAcessorio;

public class ControleRoupaEAcessorio {
	private CadastrarRoupaEAcessorio view;

	public ControleRoupaEAcessorio(CadastrarRoupaEAcessorio view) {
		
		this.view = view;
	}
	
	public void cadastrarRoupaEAcessorio() {
		
		String nome = view.getNomeTexto().getText();
		String categoria = view.getCategoriaTexto().getText();
		String modelo = view.getModeloTexto().getText();
		String tamanho = view.getTamanhoTexto().getText();
		String condicaoDeUso = view.getCondicaoDeUsoTexto().getText();
		Double preco = Double.parseDouble(view.getPrecoTexto().getText());
		String genero = view.getGeneroTexto().getText();
		String descricao = view.getDescricaoTexto().getText();
		
		Dados.getProducts().add(new RoupaEAcessorio(nome, categoria, modelo, tamanho, descricao, condicaoDeUso, preco, genero));
	}
}
