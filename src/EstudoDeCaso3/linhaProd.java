package EstudoDeCaso3;

import java.util.ArrayList;

public class linhaProd {

	private int idLinha;
	private ArrayList<Maquina> maquina = new ArrayList<Maquina>();
	private ArrayList<Produto> produto = new ArrayList<Produto>();
	private ArrayList<Operador> operador = new ArrayList<Operador>();
	private boolean statusProdução;
	private String comentario;

	public void setIdLinha(int id) {
		this.idLinha = id;
	}

	public int getIdLinha() {
		return this.idLinha;
	}

	public void addMaquina(Maquina indice) {
		this.maquina.add(indice);
	}

	public void remMaquina(int indice) {
		this.maquina.remove(indice);
	}

	public Maquina getMaquina(int indice) { // para falar qual produto está na posição inserida pelo usuário
		return this.maquina.get(indice);
	}

	public void addProduto(Produto produto) {
		this.produto.add(produto);
	}

	public void remProduto(int indice) {
		this.produto.remove(indice);
	}

	public Produto getProduto(int indice) {
		return this.produto.get(indice);
	}

	public void addOperador(Operador produto) {
		this.operador.add(produto);
	}

	public void remOperador(int indice) { // remover produto do carrinho
		this.operador.remove(indice);
	}

	public Operador getOperador(int indice) { // para falar qual produto está na posição inserida pelo usuário
		return this.operador.get(indice);
	}

	public void setStatusProdução(boolean statusProdução) {
		this.statusProdução = statusProdução;
	}

	public boolean getStatusProdução() {
		return statusProdução;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

}
