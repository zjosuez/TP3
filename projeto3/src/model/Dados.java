package model;

import java.util.ArrayList;

/**
 * Classe responsavel por simular um banco de dados
 * @author Josue Teixeira Santana
 *
 */
public class Dados {
	private static final ArrayList<RoupaEAcessorio> products = new ArrayList<>();
	private static final ArrayList<Cliente> dadosCliente = new ArrayList<>();
	private static final ArrayList<Vendedor> dadosVendedor = new ArrayList<>();
	private static final ArrayList<Venda> dadosVenda = new ArrayList<>();
	
	/**
	 * Todos os dados pre-cadastrados automaticamente
	 * 
	 * @see RoupaEAcessorio
	 * @see Cliente
	 * @see Vendedor
	 */
	public static void cadastrarDados() {
		
		Cliente cliente1 = new Cliente("Malu Rosa Aragão", "96680021219", "Rua Dom Pedro II", "8239755922");
		Cliente cliente2 = new Cliente("Giovana Vitória Stella Brito", "99922044510", "Rua Jorge Amado", "69991021313");
		Cliente cliente3 = new Cliente("Julio Lucca Sales", "50571180809", "Avenida dos Imigrantes", "69986841480");
		dadosCliente.add(cliente1);
		dadosCliente.add(cliente2);
		dadosCliente.add(cliente3);
	 
		RoupaEAcessorio produto1 = new RoupaEAcessorio("Camisa azul zara", "Camisas", "Gola italiana", "36", "camisa azul confeccionada em cetim,"
				+ " o modelo possui gola italiana e fecho por botões", "Novo", 99.36, "Feminino");
		RoupaEAcessorio produto2 = new RoupaEAcessorio("Camisa bege gregory", "Camisas", "Gola italiana", "42", "camisa bege confeccionada em algodão"
				+ ", o modelo possui gola italiana, manga 3/4 e fecho por botões", "Novo", 73.50, "Feminino");
		RoupaEAcessorio produto3 = new RoupaEAcessorio("Vestido azul guess", "Vestidos", "Decote redondo", "42", "vestido azul confeccionada em malha"
				+ ", o modelo possui decote redondo, fecho de zíper na parte posterior", "Usado", 88.50, "Feminino");
		RoupaEAcessorio produto4 = new RoupaEAcessorio("Vestido ombro preto", "Vestidos", "Decote ombro", "M", "vestido preto confeccionado em tecido plano,"
				+ " o modelo possui decote ombro só, fecho em zíper na posterior", "Usado", 62, "Feminino");
		RoupaEAcessorio produto5 = new RoupaEAcessorio("Calça jeans jogger", "Calças", "Jogger", "GG", "Calça tamanho gg , jeans molinho, pouco usada,"
				+ " sem avarias", "Usado", 53, "Masculino");
		RoupaEAcessorio produto6 = new RoupaEAcessorio("Calça nike dri fit", "Calças", "Dri fit", "GG", "calça tamanho gg original, com 2 desfiados como nas fotos"
				, "Usado", 37, "Masculino");
		products.add(produto1);
		products.add(produto2);
		products.add(produto3);
		products.add(produto4);
		products.add(produto5);
		products.add(produto6);
		
		Vendedor vendedor1 = new Vendedor("Gabriel Joaquim Isaac Carvalho", "20526590998", "Quadra Quadra 205 Conjunto 15", "61989542564", produto1);
		Vendedor vendedor2 = new Vendedor("Benício Severino Lima", "29242660256", "Condomínio Privê II Quadra 1 Conjunto C", "61989769414",produto2);
		Vendedor vendedor3 = new Vendedor("Luana Fabiana Brenda Galvão", "69394905073", "Rua Hércules Santos", "71988274660",produto3);
		dadosVendedor.add(vendedor1);
		dadosVendedor.add(vendedor2);
		dadosVendedor.add(vendedor3);
		
		
	}
	
	/**
	 * Todos os metodos (getters e setters) referente aos atributos da classe
	 * @return - Getters e setters
	 */
	public static ArrayList<RoupaEAcessorio> getProducts() {
		return products;
	}
	
	public static ArrayList<Cliente> getCliente() {
		return dadosCliente;
	}
	
	public static ArrayList<Vendedor> getVendedor() {
		return dadosVendedor;
	}

	public static ArrayList<Venda> getDadosvenda() {
		return dadosVenda;
	}
}
