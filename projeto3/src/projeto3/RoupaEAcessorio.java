package projeto3;

import java.util.ArrayList;

public class RoupaEAcessorio {
	
	private String nome;
	private String categoria;
	private String modelo;
	private String tamanho;
	private String descricao;
	private String condicaoDeUso;
	private double preco;
	private String genero;
	private ArrayList<RoupaEAcessorio> products = new ArrayList<RoupaEAcessorio>();
	
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

	// Methods
	public void cadastrar() {     
		products.add(new RoupaEAcessorio(nome, categoria, modelo, tamanho, descricao, condicaoDeUso, preco, genero));
		System.out.println("O produto " + nome + " foi cadastrado com sucesso!");
//		
	}
		
	public void deletar(int posicaoExcluir) {
		System.out.println("O produto " + products.get(posicaoExcluir).getNome() + " foi removido com sucesso!");
		products.remove(posicaoExcluir);
			
	}
	
	public void verRoupaEAcessorio() {
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "-----Dados do produto-----\nNome: " + nome + "\nCategoria: " + categoria + "\nModelo: " + modelo + "\nTamanho: "
				+ tamanho + "\nDescricao: " + descricao + "\nCondicao de uso: " + condicaoDeUso + "\nPreco: " + preco
			    + "\nGenero: " + genero + "\n";
	}

	public void buscar(String nomeBusca) {
		for(int i = 0; i < products.size() ; i++) {
			if (products.get(i).getNome().equals(nomeBusca)) {
				System.out.println("O produto " + products.get(i).getNome() + " foi encontrado\n");
			} else {
				System.out.println("Produto não encontrado\n");
			}
		}
	}
}
