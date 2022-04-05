package model;

/**
 * Classe responsavel pelos atributos do produto e suas respectivas informacoes
 * 
 * @author Josue Teixeira Santana
 *
 */
public class RoupaEAcessorio {
	
	private String nome;
	private String categoria;
	private String modelo;
	private String tamanho;
	private String descricao;
	private String condicaoDeUso;
	private double preco;
	private String genero;

	
	/**
	 * Contrutor da classe, responsavel pelo armazenamento das informacoes
	 * 
	 * @param nome - nome do produto
	 * @param categoria - categoria do produto
	 * @param modelo - modelo do produto
	 * @param tamanho - tamanho do produto
	 * @param descricao - descricao do produto
	 * @param condicaoDeUso - condicao de uso 
	 * @param preco - preco do produto
	 * @param genero - genero do produto
	 */
	public RoupaEAcessorio(String nome, String categoria, String modelo, String tamanho, String descricao,
			String condicaoDeUso, double preco, String genero) {
	
		this.nome = nome;
		this.categoria = categoria;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.descricao = descricao;
		this.condicaoDeUso = condicaoDeUso;
		this.preco = preco;
		this.genero = genero;
	}

	/**
	 * Metodos getters e setters referente aos atributos da classe Cliente
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void getModelo() {
		System.out.println(modelo);
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void getTamanho() {
		System.out.println(tamanho);
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void getDescricao() {
		System.out.println(descricao);
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void getCondicaoDeUso() {
		System.out.println(condicaoDeUso);
	}
	
	public void setCondicaoDeUso(String condicaoDeUso) {
		this.condicaoDeUso = condicaoDeUso;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void getGenero() {
		System.out.println(genero);
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * Metodo responsavel por sobrescrever o objeto toString
	 * @return - Retorna uma String contento os dados armazenado
	 * na classe RoupaEAcessorio
	 */
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCategoria: " + categoria + "\n Modelo: " + modelo + "\n Tamanho: "
				+ tamanho + "\nDescricao: " + descricao + "\nCondicao de uso: " + condicaoDeUso + "\nPreco: " + preco
				+ "\nGenero: " + genero;
	}
}
