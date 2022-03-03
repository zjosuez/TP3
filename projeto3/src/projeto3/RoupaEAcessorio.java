package projeto3;

import java.util.ArrayList;

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
	private ArrayList<RoupaEAcessorio> products = new ArrayList<RoupaEAcessorio>();
	
	// Constructor 
	public RoupaEAcessorio(String nome, String categoria, String modelo, int tamanho, String descricao,
			String condicaoDeUso, double preco, String tipo, String genero) {
	
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
	
	public void getCategoria() {
		System.out.println(categoria);
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
	
	public void setTamanho(int tamanho) {
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
	
	public void getPreco() {
		System.out.println(preco);
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void getTipo() {
		System.out.println(tipo);
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void getGenero() {
		System.out.println(genero);
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Methods
	public void cadastrar() {     
		
		
//		products.add(new RoupaEAcessorio(nome, categoria, modelo, tamanho, descricao, condicaoDeUso, preco, tipo, genero));
//		System.out.println("O produto " + nome + " foi cadastrado com sucesso!");
//		
	}
	
	public void editar(int posicaoEditar,String nome, String categoria, String modelo, int tamanho, String descricao, String condicaoDeUso, double preco,  String tipo, String genero) {
		products.get(posicaoEditar).setNome(nome);
		products.get(posicaoEditar).setCategoria(categoria);
		products.get(posicaoEditar).setModelo(modelo);
		products.get(posicaoEditar).setTamanho(tamanho);
		products.get(posicaoEditar).setDescricao(descricao);
		products.get(posicaoEditar).setCondicaoDeUso(condicaoDeUso);
		products.get(posicaoEditar).setPreco(preco);
		products.get(posicaoEditar).setTipo(tipo);
		products.get(posicaoEditar).setGenero(genero);
	}
	
	public void deletar(int posicaoExcluir) {
		System.out.println("O produto " + products.get(posicaoExcluir).getNome() + " foi removido com sucesso!");
		products.remove(posicaoExcluir);
			
	}
	
	public void ler() {
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "RoupaEAcessorio [nome=" + nome + ", categoria=" + categoria + ", modelo=" + modelo + ", tamanho="
				+ tamanho + ", descricao=" + descricao + ", condicaoDeUso=" + condicaoDeUso + ", preco=" + preco
				+ ", tipo=" + tipo + ", genero=" + genero + ", products=" + products + "]";
	}

	public void buscar(String nomeBusca) {
		for(int i = 0; i < products.size() ; i++) {
			if (products.get(i).getNome().equals(nomeBusca)) {
				System.out.println("O produto " + products.get(i).getNome() + " foi encontrado");
			} else {
				System.out.println("Produto não encontrado");
			}
		}
	}
}
