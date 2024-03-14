package EstudoDeCaso3;

import java.util.ArrayList;
import java.util.Date;

import SistemaVendas.Produto;

public class Pedido {

	private int idPedido;
	private Date dataEntrega;
	private float preco;
	private Cliente cliente;
	private ArrayList<Produto> produto = new ArrayList<>();
	
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	public int getIdPedido() {
		return this.idPedido;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public Date getDataEntrega() {
		return this.dataEntrega;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void addProduto(Produto produto) {
		this.produto.add(produto);
	}
	
	public void remProduto(int indice) { // remover produto do carrinho
		this.produto.remove(indice);
	}
	
	public Produto getProduto(int indice) { // para falar qual produto está na posição inserida pelo usuário
		return this.produto.get(indice);
	}
	
	public float getValorTotal() { // fazer a soma de todos os produtos dentro do carrinho
		float valorTotal = 0;
		for(int i = 0; i < produto.size(); i++) {
			valorTotal += getProduto(i).getPreco();
		}
		return valorTotal;
	}
	
}
