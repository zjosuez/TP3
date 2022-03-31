package model;

import java.util.ArrayList;

public class Dados {
	private static final ArrayList<RoupaEAcessorio> products = new ArrayList<>();
	private static final ArrayList<Cliente> dadosCliente = new ArrayList<>();
	
	public static ArrayList<RoupaEAcessorio> getProducts() {
		return products;
	}
	
	public static ArrayList<Cliente> getCliente() {
		return dadosCliente;
	}
}
