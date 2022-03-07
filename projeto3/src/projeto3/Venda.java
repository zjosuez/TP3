package projeto3;

import java.util.ArrayList;
import java.util.Date;

public class Venda{
	private RoupaEAcessorio roupaeacessorio;
	private Date dataVenda;
	private int qtdProduto;
	private double precoTotal;
	private String formaPagamento;
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	// Constructor
	public Venda(RoupaEAcessorio roupaeacessorio, Date dataVenda, int qtdProduto,
			String formaPagamento, double precoTotal) {
		this.roupaeacessorio = roupaeacessorio;
		this.dataVenda = dataVenda;
		this.qtdProduto = qtdProduto;
		this.formaPagamento = formaPagamento;
	}
	
	// Getters and Setters
	public RoupaEAcessorio getRoupaeacessorio() {
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
	
	// Methods
	public void cadastrar() {
		RoupaEAcessorio produtoVenda = getRoupaeacessorio();
		Double precoVenda = roupaeacessorio.getPreco();
		if (getQtdProduto() > 1) {
			setPrecoTotal(precoVenda* qtdProduto);
		} else {
			setPrecoTotal(precoVenda);
		}
		
		vendas.add(new Venda(produtoVenda, dataVenda, qtdProduto, formaPagamento, precoTotal));
	}
	
	public void editar(int posicaoEditar,RoupaEAcessorio roupaeacessorio, Date dataVenda, int qtdProduto,
			String formaPagamento) {
		vendas.get(posicaoEditar).setRoupaeacessorio(roupaeacessorio);
		vendas.get(posicaoEditar).setDataVenda(dataVenda);
		vendas.get(posicaoEditar).setQtdProduto(qtdProduto);
	}
	
	public void deletar(int vendaRemover) {
		System.out.println("A venda foi removida com sucesso!");
		vendas.remove(vendaRemover);
	}

	@Override
	public String toString() {
		return  "Data da venda: " + dataVenda + "\nQuantidade do produto: " + qtdProduto
				+ "\nPreco total: " + precoTotal + "\nForma de pagamento: " + formaPagamento;
	}
}
