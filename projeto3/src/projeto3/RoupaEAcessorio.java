package projeto3;

public class RoupaEAcessorio {
	private String nome;
	private String categoria;
	private String modelo;
	private int tamanho;
	private String descricao;
	private String condicaoDeUso;
	private double preco;
	private String tipo;
	private String genero;
	
	// Constructor
	public RoupaEAcessorio(String nome, String categoria, String modelo, int tamanho, String descricao,
			String condicaoDeUso, double preco, String tipo, String genero) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.descricao = descricao;
		this.condicaoDeUso = condicaoDeUso;
		this.preco = preco;
		this.tipo = tipo;
		this.genero = genero;
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCondicaoDeUso() {
		return condicaoDeUso;
	}
	public void setCondicaoDeUso(String condicaoDeUso) {
		this.condicaoDeUso = condicaoDeUso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Methods
	public void cadastrar() {
		
	}
	
	public void editar() {
		
	}
	
	public void deletar() {
		
	}
	
	public void ler() {
		
	}
	
	public void buscar() {
		
	}
	
}
