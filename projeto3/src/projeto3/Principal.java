package projeto3;

import java.util.*;

public class Principal {
	static RoupaEAcessorio a1;
	static Cliente c1;
	static Vendedor v1;
	static Venda vd1;
	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		Date now = d.getTime();
		
		// Dados 1:
		a1 = new RoupaEAcessorio("roupa1", "roupa1", "roupa1", 10, "roupa1", "roupa1", 1000, "roupa1", "roupa1");
		a1.cadastrar();
		a1.editar(0, "roupa1", "roupa1", "roupa1", 1000, "roupa1", "roupa1", 1000, "roupa1", "roupa1");
		c1 = new Cliente("Josue", true, "123456789", "Teste indereco", 994268341, now);
		v1 = new Vendedor("Vendedor1", "11111111", "teste1", 12345678, a1);
		vd1 = new Venda(a1, now, 1, "dinheiro", 1100);
		
		vd1.cadastrar();
		c1.cadastrar("josue", "11111111", "rua sao vicente 10", 123456789);
		v1.cadastrar("miguel", "023518497", "rua sao carlos 12", 546913728);
		c1.comprarProduto(vd1);
//		System.out.println(vd1.toString());
	}
}
