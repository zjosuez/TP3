package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe responsavel pela venda do produto ao cliente
 * @author Josue Teixeira Santana
 *
 */
public class Venda{
	private Object roupaeacessorio;
	private Date dataVenda;
	private int qtdProduto;
	private double precoTotal;
	private String formaPagamento;
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	/**
	 * Contrutor da classe, responsavel pelo amazenamento das informacoes da venda
	 * @param produto
	 * @param dataVenda
	 * @param qtdProduto
	 * @param formaPagamento
	 * @param precoTotal
	 */
	public Venda(Object produto, int qtdProduto,
			String formaPagamento, double preco) {
		this.roupaeacessorio = produto;
		this.qtdProduto = qtdProduto;
		this.formaPagamento = formaPagamento;
	}
	
	/**
	 * Metodos getters e setters referente aos atributos da classe Cliente
	 * @return getters e setters
	 */
	public Object getRoupaeacessorio() {
		return roupaeacessorio;
	}
	public void setRoupaeacessorio(RoupaEAcessorio roupaeacessorio) {
		this.roupaeacessorio = roupaeacessorio;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * Metodo responsavel por sobrescrever o objeto
	 * @return - Retorna uma String contento os dados da venda
	 */
	@Override
	public String toString() {
		return  "Data da venda: " + dataVenda + "\nQuantidade do produto: " + vendas.get(0).getQtdProduto()
				+ "\nPreco total: " + vendas.get(0).getPrecoTotal() + "\nForma de pagamento: " + vendas.get(0).getFormaPagamento();
	}
}
