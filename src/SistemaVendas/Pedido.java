package SistemaVendas;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int numero;
	private Date data;
	private int qtdItens;
	
	private Pessoa pessoa;
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void addProduto(Produto produto) { // adicionar produto no carrinho
		this.produtos.add(produto);
	}
	
	public void removeProduto(int indice) { // remover produto do carrinho
		this.produtos.remove(indice);
	}
	
	public Produto getProduto(int indice) { // para falar qual produto está na posição inserida pelo usuário
		return this.produtos.get(indice);
	}
	
	public float getValorTotal() { // fazer a soma de todos os produtos dentro do carrinho
		float valorTotal = 0;
		for(int i = 0; i < produtos.size(); i++) {
			valorTotal += getProduto(i).getPreco();
		}
		return valorTotal;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public boolean setNumero(int num) {
		this.numero = num;
		return true;
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean setDate(Date data) {
		this.data = data;
		return true;
	}

	public Date getDate() {
		return this.data;
	}

	public boolean setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
		return true;
	}

	public int getQtdItens() {
		return this.qtdItens;
	}

}
