package projeto3;

import java.util.*;

public class Principal {
	static RoupaEAcessorio a1;
	static RoupaEAcessorio a2;
	static Cliente c1;
	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		Date now = d.getTime();
		c1 = new Cliente("Josue", true, "123456789", "Teste indereco", 994268341, now);
		c1.cadastrar("Matheus", true, "321654987", "teste 01", 1111111, now);
		c1.cadastrar("Guilherme", true, "222222222", "teste 02", 2222222, now);
		c1.buscar("Guilherme");
//		c1.editar("Matheus", 12351, "Qno 81 abcde", 1111111);
	}
}
