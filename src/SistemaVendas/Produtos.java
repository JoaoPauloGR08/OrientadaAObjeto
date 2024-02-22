package SistemaVendas;

public class Produtos {

	private String descricao;
	private int preco;

	public boolean setDesc(String desc) {
		this.descricao = desc;
		return true;
	}

	public String getDesc() {
		return this.descricao;
	}

	public boolean setPreco(int preco) {
		this.preco = preco;
		return true;
	}

	public int getPreco() {
		return this.preco;
	}

}
