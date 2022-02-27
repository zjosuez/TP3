package projeto3;

public class Venda{
	private RoupaEAcessorio roupaeacessorio;
	private String dataVenda;
	private int qtdProduto;
	private double precoTotal;
	private String formaPagamento;
	
	// Constructor
	public Venda(RoupaEAcessorio roupaeacessorio, String dataVenda, int qtdProduto, double precoTotal,
			String formaPagamento) {
		this.roupaeacessorio = roupaeacessorio;
		this.dataVenda = dataVenda;
		this.qtdProduto = qtdProduto;
		this.precoTotal = precoTotal;
		this.formaPagamento = formaPagamento;
	}
	
	// Getters and Setters
	public RoupaEAcessorio getRoupaeacessorio() {
		return roupaeacessorio;
	}
	public void setRoupaeacessorio(RoupaEAcessorio roupaeacessorio) {
		this.roupaeacessorio = roupaeacessorio;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
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
	
}
