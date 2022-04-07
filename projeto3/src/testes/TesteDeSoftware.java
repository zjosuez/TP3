package testes;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.DefaultComboBoxModel;

import org.junit.jupiter.api.Test;
import model.Cliente;
import model.Dados;
import model.RoupaEAcessorio;
import model.Vendedor;
import view.MenuContaCliente;
import view.ViewBusca;

/**
 * Classe de testes responsavel pelos testes de alguns metodos para verificar
 * se eles estao funcionando como esperado
 * 
 * @author Josue Teixeira Santana
 *
 */
class TesteDeSoftware {

	private boolean testProduto;

	/**
	 * Metodo de cadastro do produto
	 * responsavel por testar se o produto 
	 * esta sendo cadastrado corretamente
	 */
	@Test
	void testCadastrarProduto() {
		
		boolean produto1;
		boolean produto2;
		produto1 = Dados.getProducts().add(new RoupaEAcessorio("Camisa bege gregory", "Camisas", "Gola italiana", "42", "camisa bege confeccionada em algodão"
				+ ", o modelo possui gola italiana, manga 3/4 e fecho por botões com vista simples na parte frontal", "Novo", 73.50, "Feminino"));
		
		produto2 = Dados.getProducts().add(new RoupaEAcessorio("Calça jeans jogger", "Calças", "Jogger", "GG", "Calça tamanho gg , jeans molinho, pouco usada,"
				+ " sem avarias", "Usado", 53, "Masculino"));
		
		assertTrue(produto1);
		assertTrue(produto2);
	}
	
	/**
	 * Metodo de cadastro do cliente
	 * responsavel por testar se o cliente
	 * esta sendo cadastrado corretamente
	 */
	@Test
	void testCadastrarCliente() {
		
		boolean cliente1, cliente2;
		cliente1 = Dados.getCliente().add(new Cliente("Julio Lucca Sales", "50571180809", "Avenida dos Imigrantes", "69986841480"));
		cliente2 = Dados.getCliente().add(new Cliente("Giovana Vitória Stella Brito", "99922044510", "Rua Jorge Amado", "69991021313"))	;
		
		assertTrue(cliente1);
		assertTrue(cliente2);
	}
	
	/**
	 * Metodo de buscar o vendedor pelo nome
	 * e criado um produto e um novo vendedor e armazenado
	 * na classe dados, depois e feito a busca com a variavel
	 * nomeVendedor1 e verificado se essa busca retorna verdadeiro
	 */
	@Test
	void testBuscarVendedor() {
		
		testProduto = Dados.getProducts().add(new RoupaEAcessorio("Camisa azul zara", "Camisas", "Gola italiana", "36", "camisa azul confeccionada em cetim,"
				+ " o modelo possui gola italiana e fecho por botões", "Novo", 99.36, "Feminino"));
		
		Dados.getVendedor().add(new Vendedor("Gabriel Joaquim Isaac Carvalho", "69394905073", "Rua Hércules Santos", "71988274660", testProduto));
		
		ViewBusca view = new ViewBusca();
		String nomeVendedor1 = "Gabriel Joaquim Isaac Carvalho";
		assertTrue(view.getController1().verificarIgualdade(nomeVendedor1));
		
	}
	
	/**
	 * Teste o metodo atualizarClientes da classe MenuContaCliente.
	 * O metodo faz uma busca pelo cliente e depois retorna uma lista
	 * no formato comboBox com todos os clientes cadastrados
	 */
	@Test
	void testCadastroCliente() {
		
		Dados.getCliente().add(new Cliente("Giovana Vitória Stella Brito", "99922044510", "Rua Jorge Amado", "69991021313"));
		MenuContaCliente tela = new MenuContaCliente();
		DefaultComboBoxModel<String> listaClientes = tela.getController().atualizarClientes();
		assertFalse(listaClientes.getSize() == 0);
		
	}

}
