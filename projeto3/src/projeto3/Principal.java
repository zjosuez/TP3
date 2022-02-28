package projeto3;

import java.util.*;

public class Principal {
	static RoupaEAcessorio a1;
	static RoupaEAcessorio a2;
	
	public static void main(String[] args) {
		
		a1 = new RoupaEAcessorio("camisa","camisas", "camisa lisa", 18, "camisa muito linda", "bom estado", 1800, "não sei", "masculino");
		a1.cadastrar();
		a1.buscar("camisa");
		
//		a1.editar(0, "calca", "calca", "calca", 24, "calca", "calca", 2000, "calca", "calca");
		a2 = new RoupaEAcessorio("calca","calcas", "calca lisa", 18, "calca muito linda", "bom estado", 1800, "não sei", "masculino");
		
	}
}
