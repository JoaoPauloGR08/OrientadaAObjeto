package SistemaVendas;

public class Produto {

	private String nome;
	private String descricao;
	private float preco;
	
	public boolean setNome(String nome) {
		if(nome.matches(".*[a-zA-Z].*")) {
			this.nome = nome;
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}

	public boolean setDesc(String desc) {
		this.descricao = desc;
		return true;
	}

	public String getDesc() {
		return this.descricao;
	}

	public boolean setPreco(float preco) {
		this.preco = preco;
		return true;
	}

	public float getPreco() {
		return this.preco;
	}

}
