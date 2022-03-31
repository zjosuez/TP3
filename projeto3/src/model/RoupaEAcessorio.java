package model;


public class RoupaEAcessorio {
	
	private String nome;
	private String categoria;
	private String modelo;
	private String tamanho;
	private String descricao;
	private String condicaoDeUso;
	private double preco;
	private String genero;

	
	// Constructor 
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
	
	@Override
	public String toString() {
		return "nome=" + nome + "\n categoria=" + categoria + "\n modelo=" + modelo + "\n tamanho="
				+ tamanho + "\n descricao=" + descricao + "\n condicaoDeUso=" + condicaoDeUso + "\n preco=" + preco
				+ "\n genero=" + genero;
	}

	// Getters and setters
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

}
