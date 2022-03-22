package projeto3;

import java.util.*;

public class Principal {
	static RoupaEAcessorio a1;
	static RoupaEAcessorio a2;
	static Cliente c1;
	static Cliente c2;
	static Vendedor v1;
	static Vendedor v2;
	static Venda vd1;
	static Venda vd2;
	
	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		Date now = d.getTime();
		
		// Dados 1:
		a1 = new RoupaEAcessorio("Camisa", "Roupas", "Manga Longa", "M", "Regata esportiva que faz toda diferença no seu treino", "Novo", 105.30, "Masculino");
		c1 = new Cliente();
		v1 = new Vendedor();
		vd1 = new Venda(a1, now, 2, "dinheiro", 0);
		
		a1.cadastrar();
		c1.cadastrar("Matheus", "11111111", "rua sao vicente 10", 123456789);
		v1.cadastrar("Miguel", "023518497", "rua sao carlos 12", 546913728);
		vd1.cadastrar();
		
		v1.verPessoa();
		c1.verPessoa();
		a1.verRoupaEAcessorio();
		
		a1.buscarNome("Camisa");
		a1.buscarCategoria("Roupas");
		
		System.out.println(vd1.toString());
		c1.comprarProduto(vd1);
		
		// Dados 2:
		System.out.println("\n\n-----Dados 2-----\n\n");
		
		a2 = new RoupaEAcessorio("Bolsa em croche", "Acessorios", "Croche", "-", "bolsa em crochê, com alça pequena removível. possui botão em imã.", "Novo", 100, "Feminino");
		c2 = new Cliente();
		v2 = new Vendedor();
		vd2 = new Venda(a2, now, 5, "dinheiro", 0);
		
		a2.cadastrar();
		c2.cadastrar("Thiago", "55442233","Setor comercial M", 22557788);
		v2.cadastrar("Julia", "748123499", "Rua Copaiba", 341975289);
		vd2.cadastrar();
		
		vd2.editar(0, a2, now, 1, "Cartao");
		c2.buscar("Thiago");
		
		v2.verPessoa();
		c2.verPessoa();
		a2.verRoupaEAcessorio();
		System.out.println(vd2.toString());
		c2.comprarProduto(vd2);
		
		
	}
}
