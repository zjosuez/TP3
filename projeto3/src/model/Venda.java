package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe responsavel pela venda do produto ao cliente
 * @author Josue Teixeira Santana
 *
 */
public class Venda{
	private RoupaEAcessorio roupaeacessorio;
	private Date dataVenda;
	private int qtdProduto;
	private double precoTotal;
	private String formaPagamento;
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	/**
	 * Contrutor da classe, responsavel pelo amazenamento das informacoes da venda
	 * @param roupaeacessorio
	 * @param dataVenda
	 * @param qtdProduto
	 * @param formaPagamento
	 * @param precoTotal
	 */
	public Venda(RoupaEAcessorio roupaeacessorio, Date dataVenda, int qtdProduto,
			String formaPagamento, double precoTotal) {
		this.roupaeacessorio = roupaeacessorio;
		this.dataVenda = dataVenda;
		this.qtdProduto = qtdProduto;
		this.formaPagamento = formaPagamento;
	}
	
	/**
	 * Metodos getters e setters referente aos atributos da classe Cliente
	 */
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
		Double precoVenda = roupaeacessorio.getPreco();
		if (getQtdProduto() > 1) {
			setPrecoTotal(precoVenda* qtdProduto);
		} else {
			setPrecoTotal(precoVenda);
		}
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
	
	
//	public void cadastrar() {
//		RoupaEAcessorio produtoVenda = getRoupaeacessorio();
//		Double precoVenda = roupaeacessorio.getPreco();
//		if (getQtdProduto() > 1) {
//			setPrecoTotal(precoVenda* qtdProduto);
//		} else {
//			setPrecoTotal(precoVenda);
//		}
//		
//		vendas.add(new Venda(produtoVenda, dataVenda, qtdProduto, formaPagamento, precoTotal));
//	}
//	
//	public void editar(int posicaoEditar,RoupaEAcessorio roupaeacessorio, Date dataVenda, int qtdProduto,
//			String formaPagamento) {
//		vendas.get(posicaoEditar).setRoupaeacessorio(roupaeacessorio);
//		vendas.get(posicaoEditar).setDataVenda(dataVenda);
//		vendas.get(posicaoEditar).setQtdProduto(qtdProduto);
//		vendas.get(posicaoEditar).setFormaPagamento(formaPagamento);
//	}
//	
//	public void deletar(int vendaRemover) {
//		System.out.println("A venda foi removida com sucesso!");
//		vendas.remove(vendaRemover);
//	}

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
